package students.ernests_subhankulovs.lesson_12.level_6.task_37;

import java.util.ArrayList;
import java.util.List;

class ProductValidatorImplTest {

    ProductValidatorImpl productValidator = new ProductValidatorImpl();
    Assertions assertions = new Assertions();

    public static void main(String[] args) throws ValidationException {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.testTitleRule1();
        test.testTitleRule2();
        test.testTitleRule3();
        test.testTitleRule4();
        test.testPriceRule1();
        test.testPriceRule2();
        test.testPriceRule3();
        test.testDescriptionRule1();
        test.testDescriptionRule2();
    }

    public void testTitleRule1() throws ValidationException {
        Product product = new Product("", 15, "Description");
        List<ValidationException> exceptionList = productValidator.validate(product);
        List<ValidationException> expectedExceptionList = new ArrayList<>();
        expectedExceptionList.add(new ValidationException("Name validation rule #1", "Name cannot be blank!", "Name"));
        assertions.assertExceptionListTestResult(expectedExceptionList, exceptionList, "Title Rule 1 test");
    }

    public void testTitleRule2() throws ValidationException {
        Product product = new Product("AB", 15, "Description");
        List<ValidationException> exceptionList = productValidator.validate(product);
        List<ValidationException> expectedExceptionList = new ArrayList<>();
        expectedExceptionList.add(new ValidationException("Name validation rule #2", "Name cannot be shorter than 3 symbols", "Name"));
        assertions.assertExceptionListTestResult(expectedExceptionList, exceptionList, "Title Rule 2 test");
    }

    public void testTitleRule3() throws ValidationException {
        Product product = new Product("Define a family of algorithms, encapsulate each one, and make them interchangeable. " +
                "Strategy lets the algorithm vary independently from clients that use it.", 15, "Description");
        List<ValidationException> exceptionList = productValidator.validate(product);
        List<ValidationException> expectedExceptionList = new ArrayList<>();
        expectedExceptionList.add(new ValidationException("Name validation rule #3", "Name cannot be longer than 100 symbols", "Name"));
        assertions.assertExceptionListTestResult(expectedExceptionList, exceptionList, "Title Rule 3 test");
    }

    public void testTitleRule4() throws ValidationException {
        Product product = new Product("Тест", 15, "Description");
        List<ValidationException> exceptionList = productValidator.validate(product);
        List<ValidationException> expectedExceptionList = new ArrayList<>();
        expectedExceptionList.add(new ValidationException("Name validation rule #4", "Name can contain only English letters and numbers!", "Name"));
        assertions.assertExceptionListTestResult(expectedExceptionList, exceptionList, "Title Rule 4 test");
    }

    public void testPriceRule1() throws ValidationException {
        Product product = new Product("Test", null, "Description");
        List<ValidationException> exceptionList = productValidator.validate(product);
        List<ValidationException> expectedExceptionList = new ArrayList<>();
        expectedExceptionList.add(new ValidationException("Price validation rule #1", "Price cannot be empty!", "Price"));
        assertions.assertExceptionListTestResult(expectedExceptionList, exceptionList, "Price Rule 1 test");
    }

    public void testPriceRule2() throws ValidationException {
        Product product = new Product("Test", -1, "Description");
        List<ValidationException> exceptionList = productValidator.validate(product);
        List<ValidationException> expectedExceptionList = new ArrayList<>();
        expectedExceptionList.add(new ValidationException("Price validation rule #2", "Price can contain only numbers!", "Price"));
        assertions.assertExceptionListTestResult(expectedExceptionList, exceptionList, "Price Rule 2 test");
    }

    public void testPriceRule3() throws ValidationException {
        Product product = new Product("Test", 0, "Description");
        List<ValidationException> exceptionList = productValidator.validate(product);
        List<ValidationException> expectedExceptionList = new ArrayList<>();
        expectedExceptionList.add(new ValidationException("Price validation rule #3", "Price cannot be equal to Zero!", "Price"));
        assertions.assertExceptionListTestResult(expectedExceptionList, exceptionList, "Price Rule 3 test");
    }

    public void testDescriptionRule1() throws ValidationException {
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
        List<ValidationException> exceptionList = productValidator.validate(product);
        List<ValidationException> expectedExceptionList = new ArrayList<>();
        expectedExceptionList.add(new ValidationException("Description validation rule #1", "Description cannot be longer than 2000 symbols!", "Description"));
        assertions.assertExceptionListTestResult(expectedExceptionList, exceptionList, "Description Rule 1 test");
    }

    public void testDescriptionRule2() throws ValidationException {
        Product product = new Product("Test", null, "Описание");
        List<ValidationException> exceptionList = productValidator.validate(product);
        List<ValidationException> expectedExceptionList = new ArrayList<>();
        expectedExceptionList.add(new ValidationException("Description validation rule #2", "Description can contain only English letters and numbers!", "Description"));
        assertions.assertExceptionListTestResult(expectedExceptionList, exceptionList, "Description Rule 1 test");
    }
}
