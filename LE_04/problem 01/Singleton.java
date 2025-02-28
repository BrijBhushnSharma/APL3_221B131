class Singleton{
    private static Singleton uniqueinstance;
    static int count;
    private Singleton(){count++;}
    public static Singleton getinstance(){
        if(uniqueinstance == null){
            uniqueinstance =new Singleton();
            
        }
        System.out.println(count);
        return uniqueinstance;
        
    }
}