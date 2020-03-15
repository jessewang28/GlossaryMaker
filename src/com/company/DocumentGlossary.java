package com.company;

import javax.swing.text.Document;
import java.util.ArrayList;

public class DocumentGlossary extends ArrayList<GlossaryEntry> {
    public DocumentGlossary(){
        super();
    }

    public DocumentGlossary(int size){
        super(size);
    }

    public void addWord(String word, int num){
        int x = foundOrInserted(word);
        this.get(x).add(num);
    }



    private int foundOrInserted(String word){
        for (int i=0; i<size(); i++){
            int x = get(i).getWord().compareTo(word);
            if(x==0){
                return indexOf(get(i).getWord());
            }
            else if (x>0){
                GlossaryEntry ge = new GlossaryEntry(word);
                this.add(i, ge);
                return i;
            }
            else if (x<0 && i==size()){
                GlossaryEntry ge = new GlossaryEntry(word);
                this.add(i, ge);
                return size();
            }
        }
        return 0;
    }


}
