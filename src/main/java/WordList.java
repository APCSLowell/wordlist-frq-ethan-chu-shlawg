import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    int count = 0;
    for(int i = 0; i < w.size(); i++){
        if(w[i].size() == len)
          count++;
    }
    return count;
  }

  public void removeWordsOfLength(int len)
  {
    for(int i = w.size()-1; i >= 0; i--){
        if(w[i].length() == len)
          w.remove(i);
  }
}
