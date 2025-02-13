class Solution {
    public String mergeAlternately(String word1, String word2) {
       char[] c=word1.toCharArray();
       char[] d=word2.toCharArray();
       char[] e=new char[c.length+d.length];
       int i=0,j=0;
       int k=0;
       while(i<c.length&&j<d.length){
           e[k++]=c[i++];
         e[k++]=d[j++];
       }
       while(i<c.length){
       e[k++]=c[i++];
       }
       while(j<d.length){
         e[k++]=d[j++];
       }
       return new String(e);
    }
}