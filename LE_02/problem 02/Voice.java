class Voice{
            Animal[] animals = new Animal[5];

    void prepareVoice(){
        animals[0]= new cow();
        animals[1]= new dog();
  //      animals[2]= new pig();
        animals[3]= new goat();
        animals[4]= new lion(); 
    }
    public void hear(){
        for(int i=0;i<5;i++)
            animals[i].makeVoice();
    }
}