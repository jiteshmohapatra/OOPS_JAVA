class AddNum {
   static  int num1;
   static int num2;

    public int displayAdd() {
        int add;
        add = num1 + num2;
        return add;
    }
}

class SubNum extends AddNum {
    public int displaySub() {
        int sub;
        sub = num1 - num2;
        return sub;
    }
}

class MulNum extends AddNum {
    public int displayMul() {
        int mul;
        mul = num1 * num2;
        return mul;
    }
}

class DivNum extends AddNum {
    public int displayDiv() {
        int div;
        div = num1 / num2;
        return div;
    }
}

class inherit {
    public static void main(String args[]) {
        int n1, n2, n3, n4;

        SubNum obj1 = new SubNum();
        MulNum obj2 = new MulNum();
        DivNum obj3 = new DivNum();

        obj1.num1 = 100;
        obj1.num2 = 50;

        n1 = obj1.displayAdd();
        n2 = obj1.displaySub();
        n3 = obj2.displayMul();
        n4 = obj3.displayDiv();

        System.out.println("THE NUMBER IS " + obj1.num1 + " & " + obj1.num2);
        System.out.println("The summation is: " + n1);
        System.out.println("The subtraction is: " + n2);
        System.out.println("The Multiplication is: " + n3);
        System.out.println("The division is: " + n4);
    }
}
