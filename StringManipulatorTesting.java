class StringManipulatorTesting{
    public static void main(String[] args){
        StringManipulator sM = new StringManipulator();
        String result = sM.trimAndConcat("    Hi there    ", "        Paula!       ");
        System.out.println(result);
    }
}

class StringManipulatorTesting{
    public static void main(String[] args){
        StringManipulator sM = new StringManipulator();
        Integer result = sM.getIndexOrNull("Hi, Paula", 'a');
        System.out.println(result);
    }
}

class StringManipulatorTesting{
    public static void main(String[] args){
        StringManipulator sM = new StringManipulator();
        Integer result = sM.getIndexOrNull("cat in the tophat", "dog");
        System.out.println(result);
    }
}

class StringManipulatorTesting{
    public static void main(String[] args){
        StringManipulator sM = new StringManipulator();
        String result = sM.concatSubstring("Hello",1,2,"world");
        System.out.println(result);
    }
}