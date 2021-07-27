package students.ernests_subhankulovs.lesson_12.level_6.task_48;

import java.util.List;

class ProductValidatorImplTest {

    private ProductValidatorImpl validator = new ProductValidatorImpl(new ProductTitleValidationRule(),
            new ProductPriceValidationRule(), new ProductDescriptionValidationRule());

    public static void main(String[] args) throws ValidationException {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1();
        test.rule2();
        test.rule3();
        test.rule4();
        test.rule5();
        test.rule6();
        test.rule7();
        test.rule8();
        test.rule1and5();
        test.rule1and6();
        test.rule1and7();
        test.rule1and8();
        test.rule2and5();
        test.rule2and6();
        test.rule2and7();
        test.rule2and8();
        test.rule3and5();
        test.rule3and6();
        test.rule3and7();
        test.rule1and5and8();
    }

    public void rule1() {
        Product product = new Product("", 15, "Description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "Rule 1 - Error list size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "Rule 1 - Rule name");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "Rule 1 - Field Name");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be blank"), "Rule 1 - Description");
    }

    public void rule2() {
        Product product = new Product("AB", 15, "Description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "Rule 2 - Error list size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "Rule 2 - Rule name");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "Rule 2 - Field Name");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be shorter than 3 symbols"), "Rule 2 - Description");
    }

    public void rule3() {
        Product product = new Product("Define a family of algorithms, encapsulate each one, and make them interchangeable. " +
                "Strategy lets the algorithm vary independently from clients that use it.", 15, "Description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "Rule 3 - Error list size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "Rule 3 - Rule name");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "Rule 3 - Field Name");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be longer than 100 symbols"), "Rule 3 - Description");
    }

    public void rule4() {
        Product product = new Product("Тест", 15, "Description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "Rule 4 - Error list size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "Rule 4 - Rule name");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "Rule 4 - Field Name");
        checkResult(exceptions.get(0).getDescription().equals("Title can contain only English letters and numbers"), "Rule 4 - Description");
    }

    public void rule5() {
        Product product = new Product("Test", null, "Description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "Rule 5 - Error list size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-5"), "Rule 5 - Rule name");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "Rule 5 - Field Name");
        checkResult(exceptions.get(0).getDescription().equals("Price can not be empty"), "Rule 5 - Description");
    }

    public void rule6() {
        Product product = new Product("Test", 0, "Description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "Rule 6 - Error list size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "Rule 6 - Rule name");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "Rule 6 - Field Name");
        checkResult(exceptions.get(0).getDescription().equals("Price can not be equal to Zero"), "Rule 6 - Description");
    }

    public void rule7() {
        Product product = new Product("Test", 15, "ETGBEIJNNRGTJNRWIEFFIRNGIEWFD5843548U" +
                "G4IFNU49JF49NUGHTRWFIPENUIEGNUWFIINTEBGERWFUIEJWAMCJFIRNFENBEOUBWRUBRHJNWVCORINGNFWEINMGJNTERV" +
                "NGVUIETNBUETBGRUNUNRVGUETNBRVINUENGTRVIWLNEFVUNRIUWNLIFNRIUGBERWENLMIVGUNETUGBVNREJGVNBTEGBUIERNW" +
                "FIUERJTGIUNERUIGTHEUINHRUNUIRWN5L8GH3584HO3HGUREGTBYURB5RFENXZSWXWEDNWEFUERFUTBGURTBINGTTRVUIRNVUN" +
                "TGUIE5RTGH8O5TGH5TGIHN5UGNRIUTGVNHRUNVRIUVOECETGBEIJNNRGTJNRWIEFFIRNGIEWFD5843548UG4IFNU49JF49NUGHT" +
                "RWFIPENUIEGNUWFIINTEBGERWFUIEJWAMCJFIRNFENBEOUBWRUBRHJNWVCORINGNFWEINMGJNTERVNGVUIETNBUETBGRUNUNRVGU" +
                "ETNBRVINUENGTRVIWLNEFVUNRIUWNLIFNRIUGBERWENLMIVGUNETUGBVNREJGVNBTEGBUIERNWFIUERJTGIUNERUIGTHEUINHRUNUI" +
                "RWN5L8GH3584HO3HGUREGTBYURB5RFENXZSWXWEDNWEFUERFUTBGURTBINGTTRVUIRNVUNTGUIE5RTGH8O5TGH5TGIHN5UGNRIUTGV" +
                "NHRUNVRIUVOECETGBEIJNNRGTJNRWIEFFIRNGIEWFD5843548UG4IFNU49JF49NUGHTRWFIPENUIEGNUWFIINTEBGERWFUIEJWAMCJ" +
                "FIRNFENBEOUBWRUBRHJNWVCORINGNFWEINMGJNTERVNGVUIETNBUETBGRUNUNRVGUETNBRVINUENGTRVIWLNEFVUNRIUWNLIFNRIUG" +
                "BERWENLMIVGUNETUGBVNREJGVNBTEGBUIERNWFIUERJTGIUNERUIGTHEUINHRUNUIRWN5L8GH3584HO3HGUREGTBYURB5RFENXZSWX" +
                "WEDNWEFUERFUTBGURTBINGTTRVUIRNVUNTGUIE5RTGH8O5TGH5TGIHN5UGNRIUTGVNHRUNVRIUVOECETGBEIJNNRGTJNRWIEFFIRNG" +
                "IEWFD5843548UG4IFNU49JF49NUGHTRWFIPENUIEGNUWFIINTEBGERWFUIEJWAMCJFIRNFENBEOUBWRUBRHJNWVCORINGNFWEINMGJ" +
                "NTERVNGVUIETNBUETBGRUNUNRVGUETNBRVINUENGTRVIWLNEFVUNRIUWNLIFNRIUGBERWENLMIVGUNETUGBVNREJGVNBTEGBUIERNW" +
                "FIUERJTGIUNERUIGTHEUINHRUNUIRWN5L8GH3584HO3HGUREGTBYURB5RFENXZSWXWEDNWEFUERFUTBGURTBINGTTRVUIRNVUNTGUIE" +
                "5RTGH8O5TGH5TGIHN5UGNRIUTGVNHRUNVRIUVOECETGBEIJNNRGTJNRWIEFFIRNGIEWFD5843548UG4IFNU49JF49NUGHTRWFIPENUI" +
                "EGNUWFIINTEBGERWFUIEJWAMCJFIRNFENBEOUBWRUBRHJNWVCORINGNFWEINMGJNTERVNGVUIETNBUETBGRUNUNRVGUETNBRVINUENGT" +
                "RVIWLNEFVUNRIUWNLIFNRIUGBERWENLMIVGUNETUGBVNREJGVNBTEGBUIERNWFIUERJTGIUNERUIGTHEUINHRUNUIRWN5L8GH3584HO3" +
                "HGUREGTBYURB5RFENXZSWXWEDNWEFUERFUTBGURTBINGTTRVUIRNVUNTGUIE5RTGH8O5TGH5TGIHN5UGNRIUTGVNHRUNVRIUVOECETGB" +
                "EIJNNRGTJNRWIEFFIRNGIEWFD5843548UG4IFNU49JF49NUGHTRWFIPENUIEGNUWFIINTEBGERWFUIEJWAMCJFIRNFENBEOUBWRUBRHJN" +
                "WVCORINGNFWEINMGJNTERVNGVUIETNBUETBGRUNUNRVGUETNBRVINUENGTRVIWLNEFVUNRIUWNLIFNRIUGBERWENLMIVGUNETUGBVNREJ" +
                "GVNBTEGBUIERNWFIUERJTGIUNERUIGTHEUINHRUNUIRWN5L8GH3584HO3HGUREGTBYURB5RFENXZSWXWEDNWEFUERFUTBGURTBINGTTRV" +
                "UIRNVUNTGUIE5RTGH8O5TGH5TGIHN5UGNRIUTGVNHRUNVRIUVOEC");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "Rule 7 - Error list size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-7"), "Rule 7 - Rule name");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "Rule 7 - Field Name");
        checkResult(exceptions.get(0).getDescription().equals("Description can not be longer than 2000 symbols"), "Rule 7 - Description");
    }

    public void rule8() {
        Product product = new Product("Test", 15, "Описание");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "Rule 8 - Error list size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "Rule 8 - Rule name");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "Rule 8 - Field Name");
        checkResult(exceptions.get(0).getDescription().equals("Description can contain only English letters and numbers"), "Rule 8 - Description");
    }

    public void rule1and5() {
        Product product = new Product("", null, "Description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "Rule 1 and 5 - Error list size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "Rule 1 - Rule name");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "Rule 1 - Field Name");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be blank"), "Rule 1 - Description");
        checkResult(exceptions.get(1).getRuleName().equals("RULE-5"), "Rule 5 - Rule name");
        checkResult(exceptions.get(1).getFieldName().equals("price"), "Rule 5 - Field Name");
        checkResult(exceptions.get(1).getDescription().equals("Price can not be empty"), "Rule 5 - Description");
    }

    public void rule1and6() {
        Product product = new Product("", 0, "Description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "Rule 1 and 6 - Error list size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "Rule 1 - Rule name");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "Rule 1 - Field Name");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be blank"), "Rule 1 - Description");
        checkResult(exceptions.get(1).getRuleName().equals("RULE-6"), "Rule 6 - Rule name");
        checkResult(exceptions.get(1).getFieldName().equals("price"), "Rule 6 - Field Name");
        checkResult(exceptions.get(1).getDescription().equals("Price can not be equal to Zero"), "Rule 6 - Description");
    }

    public void rule1and7() {
        Product product = new Product("", 15, "\"ETGBEIJNNRGTJNRWIEFFIRNGIEWFD5843548U\" +\n" +
                "                \"G4IFNU49JF49NUGHTRWFIPENUIEGNUWFIINTEBGERWFUIEJWAMCJFIRNFENBEOUBWRUBRHJNWVCORINGNFWEINMGJNTERV\" +\n" +
                "                \"NGVUIETNBUETBGRUNUNRVGUETNBRVINUENGTRVIWLNEFVUNRIUWNLIFNRIUGBERWENLMIVGUNETUGBVNREJGVNBTEGBUIERNW\" +\n" +
                "                \"FIUERJTGIUNERUIGTHEUINHRUNUIRWN5L8GH3584HO3HGUREGTBYURB5RFENXZSWXWEDNWEFUERFUTBGURTBINGTTRVUIRNVUN\" +\n" +
                "                \"TGUIE5RTGH8O5TGH5TGIHN5UGNRIUTGVNHRUNVRIUVOECETGBEIJNNRGTJNRWIEFFIRNGIEWFD5843548UG4IFNU49JF49NUGHT\" +\n" +
                "                \"RWFIPENUIEGNUWFIINTEBGERWFUIEJWAMCJFIRNFENBEOUBWRUBRHJNWVCORINGNFWEINMGJNTERVNGVUIETNBUETBGRUNUNRVGU\" +\n" +
                "                \"ETNBRVINUENGTRVIWLNEFVUNRIUWNLIFNRIUGBERWENLMIVGUNETUGBVNREJGVNBTEGBUIERNWFIUERJTGIUNERUIGTHEUINHRUNUI\" +\n" +
                "                \"RWN5L8GH3584HO3HGUREGTBYURB5RFENXZSWXWEDNWEFUERFUTBGURTBINGTTRVUIRNVUNTGUIE5RTGH8O5TGH5TGIHN5UGNRIUTGV\" +\n" +
                "                \"NHRUNVRIUVOECETGBEIJNNRGTJNRWIEFFIRNGIEWFD5843548UG4IFNU49JF49NUGHTRWFIPENUIEGNUWFIINTEBGERWFUIEJWAMCJ\" +\n" +
                "                \"FIRNFENBEOUBWRUBRHJNWVCORINGNFWEINMGJNTERVNGVUIETNBUETBGRUNUNRVGUETNBRVINUENGTRVIWLNEFVUNRIUWNLIFNRIUG\" +\n" +
                "                \"BERWENLMIVGUNETUGBVNREJGVNBTEGBUIERNWFIUERJTGIUNERUIGTHEUINHRUNUIRWN5L8GH3584HO3HGUREGTBYURB5RFENXZSWX\" +\n" +
                "                \"WEDNWEFUERFUTBGURTBINGTTRVUIRNVUNTGUIE5RTGH8O5TGH5TGIHN5UGNRIUTGVNHRUNVRIUVOECETGBEIJNNRGTJNRWIEFFIRNG\" +\n" +
                "                \"IEWFD5843548UG4IFNU49JF49NUGHTRWFIPENUIEGNUWFIINTEBGERWFUIEJWAMCJFIRNFENBEOUBWRUBRHJNWVCORINGNFWEINMGJ\" +\n" +
                "                \"NTERVNGVUIETNBUETBGRUNUNRVGUETNBRVINUENGTRVIWLNEFVUNRIUWNLIFNRIUGBERWENLMIVGUNETUGBVNREJGVNBTEGBUIERNW\" +\n" +
                "                \"FIUERJTGIUNERUIGTHEUINHRUNUIRWN5L8GH3584HO3HGUREGTBYURB5RFENXZSWXWEDNWEFUERFUTBGURTBINGTTRVUIRNVUNTGUIE\" +\n" +
                "                \"5RTGH8O5TGH5TGIHN5UGNRIUTGVNHRUNVRIUVOECETGBEIJNNRGTJNRWIEFFIRNGIEWFD5843548UG4IFNU49JF49NUGHTRWFIPENUI\" +\n" +
                "                \"EGNUWFIINTEBGERWFUIEJWAMCJFIRNFENBEOUBWRUBRHJNWVCORINGNFWEINMGJNTERVNGVUIETNBUETBGRUNUNRVGUETNBRVINUENGT\" +\n" +
                "                \"RVIWLNEFVUNRIUWNLIFNRIUGBERWENLMIVGUNETUGBVNREJGVNBTEGBUIERNWFIUERJTGIUNERUIGTHEUINHRUNUIRWN5L8GH3584HO3\" +\n" +
                "                \"HGUREGTBYURB5RFENXZSWXWEDNWEFUERFUTBGURTBINGTTRVUIRNVUNTGUIE5RTGH8O5TGH5TGIHN5UGNRIUTGVNHRUNVRIUVOECETGB\" +\n" +
                "                \"EIJNNRGTJNRWIEFFIRNGIEWFD5843548UG4IFNU49JF49NUGHTRWFIPENUIEGNUWFIINTEBGERWFUIEJWAMCJFIRNFENBEOUBWRUBRHJN\" +\n" +
                "                \"WVCORINGNFWEINMGJNTERVNGVUIETNBUETBGRUNUNRVGUETNBRVINUENGTRVIWLNEFVUNRIUWNLIFNRIUGBERWENLMIVGUNETUGBVNREJ\" +\n" +
                "                \"GVNBTEGBUIERNWFIUERJTGIUNERUIGTHEUINHRUNUIRWN5L8GH3584HO3HGUREGTBYURB5RFENXZSWXWEDNWEFUERFUTBGURTBINGTTRV\" +\n" +
                "                \"UIRNVUNTGUIE5RTGH8O5TGH5TGIHN5UGNRIUTGVNHRUNVRIUVOEC\"");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "Rule 1 and 7 - Error list size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "Rule 1 - Rule name");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "Rule 1 - Field Name");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be blank"), "Rule 1 - Description");
        checkResult(exceptions.get(1).getRuleName().equals("RULE-7"), "Rule 7 - Rule name");
        checkResult(exceptions.get(1).getFieldName().equals("description"), "Rule 7 - Field Name");
        checkResult(exceptions.get(1).getDescription().equals("Description can not be longer than 2000 symbols"), "Rule 7 - Description");
    }

    public void rule1and8() {
        Product product = new Product("", 15, "Описание");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "Rule 1 and 8 - Error list size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "Rule 1 - Rule name");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "Rule 1 - Field Name");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be blank"), "Rule 1 - Description");
        checkResult(exceptions.get(1).getRuleName().equals("RULE-8"), "Rule 8 - Rule name");
        checkResult(exceptions.get(1).getFieldName().equals("description"), "Rule 8 - Field Name");
        checkResult(exceptions.get(1).getDescription().equals("Description can contain only English letters and numbers"), "Rule 8 - Description");
    }

    public void rule2and5() {
        Product product = new Product("AB", null, "Description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "Rule 2 and 5 - Error list size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "Rule 2 - Rule name");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "Rule 2 - Field Name");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be shorter than 3 symbols"), "Rule 2 - Description");
        checkResult(exceptions.get(1).getRuleName().equals("RULE-5"), "Rule 5 - Rule name");
        checkResult(exceptions.get(1).getFieldName().equals("price"), "Rule 5 - Field Name");
        checkResult(exceptions.get(1).getDescription().equals("Price can not be empty"), "Rule 5 - Description");
    }

    public void rule2and6() {
        Product product = new Product("AB", 0, "Description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "Rule 2 and 6 - Error list size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "Rule 2 - Rule name");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "Rule 2 - Field Name");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be shorter than 3 symbols"), "Rule 2 - Description");
        checkResult(exceptions.get(1).getRuleName().equals("RULE-6"), "Rule 6 - Rule name");
        checkResult(exceptions.get(1).getFieldName().equals("price"), "Rule 6 - Field Name");
        checkResult(exceptions.get(1).getDescription().equals("Price can not be equal to Zero"), "Rule 6 - Description");
    }

    public void rule2and7() {
        Product product = new Product("AB", 15, "\"ETGBEIJNNRGTJNRWIEFFIRNGIEWFD5843548U\" +\n" +
                "                \"G4IFNU49JF49NUGHTRWFIPENUIEGNUWFIINTEBGERWFUIEJWAMCJFIRNFENBEOUBWRUBRHJNWVCORINGNFWEINMGJNTERV\" +\n" +
                "                \"NGVUIETNBUETBGRUNUNRVGUETNBRVINUENGTRVIWLNEFVUNRIUWNLIFNRIUGBERWENLMIVGUNETUGBVNREJGVNBTEGBUIERNW\" +\n" +
                "                \"FIUERJTGIUNERUIGTHEUINHRUNUIRWN5L8GH3584HO3HGUREGTBYURB5RFENXZSWXWEDNWEFUERFUTBGURTBINGTTRVUIRNVUN\" +\n" +
                "                \"TGUIE5RTGH8O5TGH5TGIHN5UGNRIUTGVNHRUNVRIUVOECETGBEIJNNRGTJNRWIEFFIRNGIEWFD5843548UG4IFNU49JF49NUGHT\" +\n" +
                "                \"RWFIPENUIEGNUWFIINTEBGERWFUIEJWAMCJFIRNFENBEOUBWRUBRHJNWVCORINGNFWEINMGJNTERVNGVUIETNBUETBGRUNUNRVGU\" +\n" +
                "                \"ETNBRVINUENGTRVIWLNEFVUNRIUWNLIFNRIUGBERWENLMIVGUNETUGBVNREJGVNBTEGBUIERNWFIUERJTGIUNERUIGTHEUINHRUNUI\" +\n" +
                "                \"RWN5L8GH3584HO3HGUREGTBYURB5RFENXZSWXWEDNWEFUERFUTBGURTBINGTTRVUIRNVUNTGUIE5RTGH8O5TGH5TGIHN5UGNRIUTGV\" +\n" +
                "                \"NHRUNVRIUVOECETGBEIJNNRGTJNRWIEFFIRNGIEWFD5843548UG4IFNU49JF49NUGHTRWFIPENUIEGNUWFIINTEBGERWFUIEJWAMCJ\" +\n" +
                "                \"FIRNFENBEOUBWRUBRHJNWVCORINGNFWEINMGJNTERVNGVUIETNBUETBGRUNUNRVGUETNBRVINUENGTRVIWLNEFVUNRIUWNLIFNRIUG\" +\n" +
                "                \"BERWENLMIVGUNETUGBVNREJGVNBTEGBUIERNWFIUERJTGIUNERUIGTHEUINHRUNUIRWN5L8GH3584HO3HGUREGTBYURB5RFENXZSWX\" +\n" +
                "                \"WEDNWEFUERFUTBGURTBINGTTRVUIRNVUNTGUIE5RTGH8O5TGH5TGIHN5UGNRIUTGVNHRUNVRIUVOECETGBEIJNNRGTJNRWIEFFIRNG\" +\n" +
                "                \"IEWFD5843548UG4IFNU49JF49NUGHTRWFIPENUIEGNUWFIINTEBGERWFUIEJWAMCJFIRNFENBEOUBWRUBRHJNWVCORINGNFWEINMGJ\" +\n" +
                "                \"NTERVNGVUIETNBUETBGRUNUNRVGUETNBRVINUENGTRVIWLNEFVUNRIUWNLIFNRIUGBERWENLMIVGUNETUGBVNREJGVNBTEGBUIERNW\" +\n" +
                "                \"FIUERJTGIUNERUIGTHEUINHRUNUIRWN5L8GH3584HO3HGUREGTBYURB5RFENXZSWXWEDNWEFUERFUTBGURTBINGTTRVUIRNVUNTGUIE\" +\n" +
                "                \"5RTGH8O5TGH5TGIHN5UGNRIUTGVNHRUNVRIUVOECETGBEIJNNRGTJNRWIEFFIRNGIEWFD5843548UG4IFNU49JF49NUGHTRWFIPENUI\" +\n" +
                "                \"EGNUWFIINTEBGERWFUIEJWAMCJFIRNFENBEOUBWRUBRHJNWVCORINGNFWEINMGJNTERVNGVUIETNBUETBGRUNUNRVGUETNBRVINUENGT\" +\n" +
                "                \"RVIWLNEFVUNRIUWNLIFNRIUGBERWENLMIVGUNETUGBVNREJGVNBTEGBUIERNWFIUERJTGIUNERUIGTHEUINHRUNUIRWN5L8GH3584HO3\" +\n" +
                "                \"HGUREGTBYURB5RFENXZSWXWEDNWEFUERFUTBGURTBINGTTRVUIRNVUNTGUIE5RTGH8O5TGH5TGIHN5UGNRIUTGVNHRUNVRIUVOECETGB\" +\n" +
                "                \"EIJNNRGTJNRWIEFFIRNGIEWFD5843548UG4IFNU49JF49NUGHTRWFIPENUIEGNUWFIINTEBGERWFUIEJWAMCJFIRNFENBEOUBWRUBRHJN\" +\n" +
                "                \"WVCORINGNFWEINMGJNTERVNGVUIETNBUETBGRUNUNRVGUETNBRVINUENGTRVIWLNEFVUNRIUWNLIFNRIUGBERWENLMIVGUNETUGBVNREJ\" +\n" +
                "                \"GVNBTEGBUIERNWFIUERJTGIUNERUIGTHEUINHRUNUIRWN5L8GH3584HO3HGUREGTBYURB5RFENXZSWXWEDNWEFUERFUTBGURTBINGTTRV\" +\n" +
                "                \"UIRNVUNTGUIE5RTGH8O5TGH5TGIHN5UGNRIUTGVNHRUNVRIUVOEC\"");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "Rule 2 and 7 - Error list size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "Rule 2 - Rule name");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "Rule 2 - Field Name");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be shorter than 3 symbols"), "Rule 2 - Description");
        checkResult(exceptions.get(1).getRuleName().equals("RULE-7"), "Rule 7 - Rule name");
        checkResult(exceptions.get(1).getFieldName().equals("description"), "Rule 7 - Field Name");
        checkResult(exceptions.get(1).getDescription().equals("Description can not be longer than 2000 symbols"), "Rule 7 - Description");
    }

    public void rule2and8() {
        Product product = new Product("AB", 15, "Описание");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "Rule 2 and 8 - Error list size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "Rule 2 - Rule name");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "Rule 2 - Field Name");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be shorter than 3 symbols"), "Rule 2 - Description");
        checkResult(exceptions.get(1).getRuleName().equals("RULE-8"), "Rule 8 - Rule name");
        checkResult(exceptions.get(1).getFieldName().equals("description"), "Rule 8 - Field Name");
        checkResult(exceptions.get(1).getDescription().equals("Description can contain only English letters and numbers"), "Rule 8 - Description");
    }

    public void rule3and5() {
        Product product = new Product("Define a family of algorithms, encapsulate each one, and make them interchangeable. \" +\n" +
                "                \"Strategy lets the algorithm vary independently from clients that use it.", null, "Description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "Rule 3 and 5 - Error list size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "Rule 3 - Rule name");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "Rule 3 - Field Name");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be longer than 100 symbols"), "Rule 3 - Description");
        checkResult(exceptions.get(1).getRuleName().equals("RULE-5"), "Rule 5 - Rule name");
        checkResult(exceptions.get(1).getFieldName().equals("price"), "Rule 5 - Field Name");
        checkResult(exceptions.get(1).getDescription().equals("Price can not be empty"), "Rule 5 - Description");
    }

    public void rule3and6() {
        Product product = new Product("Define a family of algorithms, encapsulate each one, and make them interchangeable. \" +\n" +
                "                \"Strategy lets the algorithm vary independently from clients that use it.", 0, "Description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "Rule 3 and 6 - Error list size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "Rule 3 - Rule name");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "Rule 3 - Field Name");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be longer than 100 symbols"), "Rule 3 - Description");
        checkResult(exceptions.get(1).getRuleName().equals("RULE-6"), "Rule 6 - Rule name");
        checkResult(exceptions.get(1).getFieldName().equals("price"), "Rule 6 - Field Name");
        checkResult(exceptions.get(1).getDescription().equals("Price can not be equal to Zero"), "Rule 6 - Description");
    }

    public void rule3and7() {
        Product product = new Product("Define a family of algorithms, encapsulate each one, and make them interchangeable. \" +\n" +
                "                \"Strategy lets the algorithm vary independently from clients that use it.", 15, "\\\"ETGBEIJNNRGTJNRWIEFFIRNGIEWFD5843548U\\\" +\\n\" +\n" +
                "                \"                \\\"G4IFNU49JF49NUGHTRWFIPENUIEGNUWFIINTEBGERWFUIEJWAMCJFIRNFENBEOUBWRUBRHJNWVCORINGNFWEINMGJNTERV\\\" +\\n\" +\n" +
                "                \"                \\\"NGVUIETNBUETBGRUNUNRVGUETNBRVINUENGTRVIWLNEFVUNRIUWNLIFNRIUGBERWENLMIVGUNETUGBVNREJGVNBTEGBUIERNW\\\" +\\n\" +\n" +
                "                \"                \\\"FIUERJTGIUNERUIGTHEUINHRUNUIRWN5L8GH3584HO3HGUREGTBYURB5RFENXZSWXWEDNWEFUERFUTBGURTBINGTTRVUIRNVUN\\\" +\\n\" +\n" +
                "                \"                \\\"TGUIE5RTGH8O5TGH5TGIHN5UGNRIUTGVNHRUNVRIUVOECETGBEIJNNRGTJNRWIEFFIRNGIEWFD5843548UG4IFNU49JF49NUGHT\\\" +\\n\" +\n" +
                "                \"                \\\"RWFIPENUIEGNUWFIINTEBGERWFUIEJWAMCJFIRNFENBEOUBWRUBRHJNWVCORINGNFWEINMGJNTERVNGVUIETNBUETBGRUNUNRVGU\\\" +\\n\" +\n" +
                "                \"                \\\"ETNBRVINUENGTRVIWLNEFVUNRIUWNLIFNRIUGBERWENLMIVGUNETUGBVNREJGVNBTEGBUIERNWFIUERJTGIUNERUIGTHEUINHRUNUI\\\" +\\n\" +\n" +
                "                \"                \\\"RWN5L8GH3584HO3HGUREGTBYURB5RFENXZSWXWEDNWEFUERFUTBGURTBINGTTRVUIRNVUNTGUIE5RTGH8O5TGH5TGIHN5UGNRIUTGV\\\" +\\n\" +\n" +
                "                \"                \\\"NHRUNVRIUVOECETGBEIJNNRGTJNRWIEFFIRNGIEWFD5843548UG4IFNU49JF49NUGHTRWFIPENUIEGNUWFIINTEBGERWFUIEJWAMCJ\\\" +\\n\" +\n" +
                "                \"                \\\"FIRNFENBEOUBWRUBRHJNWVCORINGNFWEINMGJNTERVNGVUIETNBUETBGRUNUNRVGUETNBRVINUENGTRVIWLNEFVUNRIUWNLIFNRIUG\\\" +\\n\" +\n" +
                "                \"                \\\"BERWENLMIVGUNETUGBVNREJGVNBTEGBUIERNWFIUERJTGIUNERUIGTHEUINHRUNUIRWN5L8GH3584HO3HGUREGTBYURB5RFENXZSWX\\\" +\\n\" +\n" +
                "                \"                \\\"WEDNWEFUERFUTBGURTBINGTTRVUIRNVUNTGUIE5RTGH8O5TGH5TGIHN5UGNRIUTGVNHRUNVRIUVOECETGBEIJNNRGTJNRWIEFFIRNG\\\" +\\n\" +\n" +
                "                \"                \\\"IEWFD5843548UG4IFNU49JF49NUGHTRWFIPENUIEGNUWFIINTEBGERWFUIEJWAMCJFIRNFENBEOUBWRUBRHJNWVCORINGNFWEINMGJ\\\" +\\n\" +\n" +
                "                \"                \\\"NTERVNGVUIETNBUETBGRUNUNRVGUETNBRVINUENGTRVIWLNEFVUNRIUWNLIFNRIUGBERWENLMIVGUNETUGBVNREJGVNBTEGBUIERNW\\\" +\\n\" +\n" +
                "                \"                \\\"FIUERJTGIUNERUIGTHEUINHRUNUIRWN5L8GH3584HO3HGUREGTBYURB5RFENXZSWXWEDNWEFUERFUTBGURTBINGTTRVUIRNVUNTGUIE\\\" +\\n\" +\n" +
                "                \"                \\\"5RTGH8O5TGH5TGIHN5UGNRIUTGVNHRUNVRIUVOECETGBEIJNNRGTJNRWIEFFIRNGIEWFD5843548UG4IFNU49JF49NUGHTRWFIPENUI\\\" +\\n\" +\n" +
                "                \"                \\\"EGNUWFIINTEBGERWFUIEJWAMCJFIRNFENBEOUBWRUBRHJNWVCORINGNFWEINMGJNTERVNGVUIETNBUETBGRUNUNRVGUETNBRVINUENGT\\\" +\\n\" +\n" +
                "                \"                \\\"RVIWLNEFVUNRIUWNLIFNRIUGBERWENLMIVGUNETUGBVNREJGVNBTEGBUIERNWFIUERJTGIUNERUIGTHEUINHRUNUIRWN5L8GH3584HO3\\\" +\\n\" +\n" +
                "                \"                \\\"HGUREGTBYURB5RFENXZSWXWEDNWEFUERFUTBGURTBINGTTRVUIRNVUNTGUIE5RTGH8O5TGH5TGIHN5UGNRIUTGVNHRUNVRIUVOECETGB\\\" +\\n\" +\n" +
                "                \"                \\\"EIJNNRGTJNRWIEFFIRNGIEWFD5843548UG4IFNU49JF49NUGHTRWFIPENUIEGNUWFIINTEBGERWFUIEJWAMCJFIRNFENBEOUBWRUBRHJN\\\" +\\n\" +\n" +
                "                \"                \\\"WVCORINGNFWEINMGJNTERVNGVUIETNBUETBGRUNUNRVGUETNBRVINUENGTRVIWLNEFVUNRIUWNLIFNRIUGBERWENLMIVGUNETUGBVNREJ\\\" +\\n\" +\n" +
                "                \"                \\\"GVNBTEGBUIERNWFIUERJTGIUNERUIGTHEUINHRUNUIRWN5L8GH3584HO3HGUREGTBYURB5RFENXZSWXWEDNWEFUERFUTBGURTBINGTTRV\\\" +\\n\" +\n" +
                "                \"                \\\"UIRNVUNTGUIE5RTGH8O5TGH5TGIHN5UGNRIUTGVNHRUNVRIUVOEC\\\"");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "Rule 3 and 7 - Error list size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "Rule 3 - Rule name");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "Rule 3 - Field Name");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be longer than 100 symbols"), "Rule 3 - Description");
        checkResult(exceptions.get(1).getRuleName().equals("RULE-7"), "Rule 7 - Rule name");
        checkResult(exceptions.get(1).getFieldName().equals("description"), "Rule 7 - Field Name");
        checkResult(exceptions.get(1).getDescription().equals("Description can not be longer than 2000 symbols"), "Rule 7 - Description");
    }

    public void rule1and5and8() {
        Product product = new Product("", null, "Описание");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 3, "Rule 1 and 5 and 8 - Error list size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "Rule 1 - Rule name");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "Rule 1 - Field Name");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be blank"), "Rule 1 - Description");
        checkResult(exceptions.get(1).getRuleName().equals("RULE-5"), "Rule 5 - Rule name");
        checkResult(exceptions.get(1).getFieldName().equals("price"), "Rule 5 - Field Name");
        checkResult(exceptions.get(1).getDescription().equals("Price can not be empty"), "Rule 5 - Description");
        checkResult(exceptions.get(2).getRuleName().equals("RULE-8"), "Rule 8 - Rule name");
        checkResult(exceptions.get(2).getFieldName().equals("description"), "Rule 8 - Field Name");
        checkResult(exceptions.get(2).getDescription().equals("Description can contain only English letters and numbers"), "Rule 8 - Description");

    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}

