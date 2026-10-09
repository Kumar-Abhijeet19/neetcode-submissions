class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] a=word1.toCharArray();
        char[] b=word2.toCharArray();
        int n=a.length;
        int m=b.length;
        char[] result=new char[m+n];
        int i=0;
        int j=0;
        while(i<n && j<m){
            result[i+j]=a[i];
            result[i+j+1]=b[j];
            i++;
            j++;
        }
        while(i<n){
            result[i+j]=a[i];
            i++;
        }
        while(j<m){
            result[i+j]=b[j];
            j++;
        }
        return new String(result);
    }
}