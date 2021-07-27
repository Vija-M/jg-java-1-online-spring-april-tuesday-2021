package students.ernests_subhankulovs.lesson_12.level_6.task_38;

import java.util.List;

class ProductValidatorImplTest {

    ProductValidatorImpl validator = new ProductValidatorImpl();

    public static void main(String[] args) throws ValidationException {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule2();
        test.rule3();
        test.rule4();
        test.rule5();
        test.rule6();
        test.rule7();
        test.rule8();
    }

    public void rule1_v1() throws ValidationException {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule1_v2() throws ValidationException {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule2() throws ValidationException {
        Product product = new Product("AB", 15, "Description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be shorter than 3 symbols"), "rule2");
    }

    public void rule3() throws ValidationException {
        Product product = new Product("Define a family of algorithms, encapsulate each one, and make them interchangeable. " +
                "Strategy lets the algorithm vary independently from clients that use it.", 15, "Description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule3");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be longer than 100 symbols"), "rule3");
    }

    public void rule4() throws ValidationException {
        Product product = new Product("Тест", 15, "Description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getDescription().equals("Title can contain only English letters and numbers"), "rule4");
    }

    public void rule5() throws ValidationException {
        Product product = new Product("Test", null, "Description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule5");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-5"), "rule5");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule5");
        checkResult(exceptions.get(0).getDescription().equals("TPrice can not be empty"), "rule5");
    }

    public void rule6() throws ValidationException {
        Product product = new Product("Test", 0, "Description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6");
        checkResult(exceptions.get(0).getDescription().equals("Price can not be equal to Zero"), "rule6");
    }

    public void rule7() throws ValidationException {
        Product product = new Product("Test", null, "Patterns originated as an architectural concept by Christopher " +
                "Alexander as early as 1977 (c.f. \"The Pattern of Streets,\" JOURNAL OF THE AIP, September, 1977, Vol. 32, No. 3, pp. 273–278). " +
                "In 1987, Kent Beck and Ward Cunningham began experimenting with the idea of applying patterns to programming – specifically pattern " +
                "languages – and presented their results at the OOPSLA conference that year.[2][3] In the following years, Beck, Cunningham and others " +
                "followed up on this work.\n" +
                "Design patterns gained popularity in computer science after the book Design Patterns: Elements of Reusable Object-Oriented Software was " +
                "published in 1994 by the so-called \"Gang of Four\" (Gamma et al.), which is frequently abbreviated as \"GoF\". That same year, the first " +
                "Pattern Languages of Programming Conference was held, and the following year the Portland Pattern Repository was set up for documentation of " +
                "design patterns. The scope of the term remains a matter of dispute. Notable books in the design pattern genre include:\n" +
                "•\tGamma, Erich; Helm, Richard; Johnson, Ralph; Vlissides, John (1995). Design Patterns: Elements of Reusable Object-Oriented Software. Addison-Wesley. " +
                "ISBN 978-0-201-63361-0.\n" +
                "•\tBrinch Hansen, Per (1995). Studies in Computational Science: Parallel Programming Paradigms. Prentice Hall. ISBN 978-0-13-439324-7.\n" +
                "•\tBuschmann, Frank; Meunier, Regine; Rohnert, Hans; Sommerlad, Peter (1996). Pattern-Oriented Software Architecture, Volume 1: A System of Patterns. " +
                "John Wiley & Sons. ISBN 978-0-471-95869-7.\n" +
                "•\tBeck, Kent (1997). Smalltalk Best Practice Patterns. Prentice Hall. ISBN 978-0134769042.\n" +
                "•\tSchmidt, Douglas C.; Stal, Michael; Rohnert, Hans; Buschmann, Frank (2000). Pattern-Oriented Software Architecture, Volume 2: Patterns for Concurrent and " +
                "Networked Objects. John Wiley & Sons. ISBN 978-0-471-60695-6.\n" +
                "•\tFowler, Martin (2002). Patterns of Enterprise Application Architecture. Addison-Wesley. ISBN 978-0-321-12742-6.\n" +
                "•\tHohpe, Gregor; Woolf, Bobby (2003). Enterprise Integration Patterns: Designing, Building, and Deploying Messaging Solutions. Addison-Wesley. ISBN 978-0-321-20068-6.\n" +
                "•\tFreeman, Eric T.; Robson, Elisabeth; Bates, Bert; Sierra, Kathy (2004). Head First Design Patterns. O'Reilly Media. ISBN 978-0-596-00712-6.\n" +
                "Although design patterns have been applied practically for a long time, formalization of the concept of design patterns languished for several years.[\n" +
                "and a concrete algorithm.\n");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule7");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-7"), "rule7");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule7");
        checkResult(exceptions.get(0).getDescription().equals("Description can not be longer than 2000 symbols"), "rule7");
    }

    public void rule8() throws ValidationException {
        Product product = new Product("Test", 0, "Description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8");
        checkResult(exceptions.get(0).getDescription().equals("Description can contain only English letters and numbers"), "rule8");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
