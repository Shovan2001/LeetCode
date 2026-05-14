/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int l=1,h=n;
        while(l<=h)
        {
            int version=l+(h-l)/2;

            boolean goodOrBad=isBadVersion(version);

            if(goodOrBad==false)
            l=version+1;
            else
            h=version-1;
        }
        return l;
    }
}