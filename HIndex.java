class Solution {
    public int hIndex(int[] citations) {
        //Arrays.sort(citations);
        int n = citations.length; //total number of papers 

        //Bubble Sort to sort citations in ascending order
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-1; j++) {
                if(citations[j] > citations[j+1]) 
                {
                    int temp = citations[j];
                    citations[j] = citations[j+1];
                    citations[j+1] = temp;
                }
            }
        }
        

        //Check for H-Index
        for(int i=0; i<n; i++) {
            int h = n-i;
            if (citations[i] >= h) 
            {
                return h;
            }
            
        }
        return 0;

    }
}
