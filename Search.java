
package search;


/**
 * Class of operations on ordered lists of strings.
 * You should fill in the bodies of these methods.
 */
public class Search {

//private FileStrings fileStrings;


    /**
     * Returns the index of the longest string in the list.
     * If there are several string of this length, the
     * indexed returned is the that of the first.
     *
     * @param a list of strings, in ascending order
     * @return position of an entry with the longest string in the list
     */
    public int longestWord(StringList a) {

        //O(N)
        int longestWordLength = 0;
        String index = "";
        int position = 0;

        for (int i = 0; i < a.size(); i++) {
            int aLength = a.get(i).length();
             if (aLength > longestWordLength) {
                longestWordLength = aLength;
                 index = a.get(i);
                 position = i;
             }
        }
      return position;
    }


    /**
     * Returns the number of unique elements in the list
     * @param a list of strings, in ascending order
     * @return number of unique elements in the list.
     */
    public int countUnique(StringList a) {
        //O(N)
        int noOfWords = a.size();
        int index = 0;
        for (int i = 1; i < a.size(); i++) {
                if (a.get(i-1).equals(a.get(i)) ) {
                    noOfWords--;
                    index = noOfWords;
            }
        }
        return index;
    }





    /**
     * Search for a string in an ordered collection
     * @param a collection of strings, in ascending order
     * @param k string to search for
     * @return position of an element equal to k, if any, otherwise -1
     */

    //O(LOG N)
    public int findElement(StringList a, String k) {
        // replace the following line with your implementation

       int left = 0;
       int right = a.size() - 1;

       while (left <= right) {
          int mid = ((left + right) / 2);
          String getMiddleStringValue = a.get(mid);
          if ( getMiddleStringValue.equals(k)){
              return mid;
          }
          else if ( getMiddleStringValue.compareTo(k) < 0  ) {
                left = mid + 1;
          }
          else {
                right = mid - 1;
           }

       }
        return -1;

      //  throw new UnsupportedOperationException("Not supported yet.");
    }





    /**
     * Position of a string in an ordered collection
     * @param a collection of strings, in ascending order
     * @param k string to search for
     * @return number of strings in the collection a greater than or equal to k
     */

    //O(LOG N)

    public int countGreaterOrEqual(StringList a, String k) {
        int left = 0;
        int right = a.size() - 1;

        while (left <= right) {
            int mid = ((left + right) / 2);
            String getMiddleStringValue = a.get(mid);
            if ( getMiddleStringValue.compareTo(k) <  0){
                 left = mid + 1;
            }
            else {
                right = mid - 1;
            }

        }
        return a.size() - left;

    }
}