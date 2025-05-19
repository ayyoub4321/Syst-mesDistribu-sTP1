# SystmesDistribu-sTP1
<!DOCTYPE html>
<html>
<head>
    <title>Projet Spring - Injection de Dépendances</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 20px;
        }
        h1, h2 {
            color: #2c3e50;
        }
        pre {
            background-color: #f5f5f5;
            padding: 15px;
            border-radius: 5px;
            overflow-x: auto;
        }
        code {
            font-family: Consolas, monospace;
        }
        .section {
            margin-bottom: 30px;
        }
        img {
            max-width: 100%;
            height: auto;
            border: 1px solid #ddd;
            margin: 10px 0;
        }
    </style>
</head>
<body>
    <h1>Projet Spring - Injection de Dépendances</h1>

    <div class="section">
        <h2>Code Source</h2>
        
        <h3>Présentation Statique</h3>
        <pre><code>package tp1.pres;

import tp1.Metier.Metier;
import tp1.dao.DaoImpl;

public class PresStat {
    public static void main(String[] args) {
        System.out.println("presentation Static");
        DaoImpl dao = new DaoImpl();
        Metier metier = new Metier(dao);
        System.out.print(metier.clalcul());
    }
}</code></pre>
        
        <h3>Implémentation DAO</h3>
        <pre><code>package tp1.dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("getData Implements 1");
        return 0.25;
    }
    
    public DaoImpl() {}
}</code></pre>
        
        <h3>Couche Métier</h3>
        <pre><code>package tp1.Metier;

import tp1.dao.IDao;

public class Metier implements IMetier {
    IDao dao;
    
    public Metier(IDao dao) {
        this.dao = dao;
    }
    
    public Metier() {}
    
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double clalcul() {
        return dao.getData();
    }
}</code></pre>
    </div>

    <div class="section">
        <h2>Configuration Spring</h2>
        <pre><code>&lt;beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans 
       http://www.springframework.org/schema/beans/spring-beans.xsd"&gt;
    
    &lt;bean id="dao" class="tp1.dao.DaoImpl"/&gt;
    
    &lt;bean id="metier" class="tp1.Metier.Metier"&gt;
        &lt;property name="dao" ref="dao"/&gt;
    &lt;/bean&gt;
&lt;/beans&gt;</code></pre>
    </div>

    <div class="section">
        <h2>Résultats</h2>
        <img src="img/result1.png" alt="Résultat d'exécution">
        <img src="img/result2.png" alt="Diagramme de classes">
    </div>
</body>
</html>
