package com.arobotv.problems.p0201_0300.p0278_first_bad_version;

class VersionControl {
    int bad = 0;

    public VersionControl(int bad) {
        this.bad = bad;
    }

    boolean isBadVersion(int n) {
        return n >= bad;
    }
}

public class FirstBadVersion extends VersionControl {
    public FirstBadVersion(int bad) {
        super(bad);
    }

    public int firstBadVersion(int n) {
        return firstBadVersion(0, n);
    }

    public int firstBadVersion2(int n) {
        while (isBadVersion(n)) {
            n--;
        }
        return n + 1;
    }

    public int firstBadVersion(int s, int e) {
        // 一直往e的方向偏移的话，（e+s)/2可能会导致溢出
        int mid = (e >> 1) + (s >> 1);
        if (s == e)
            return e;
        if (isBadVersion(mid))
            return firstBadVersion(s, mid);
        else
            // 既然不是bad，这里就要+1
            return firstBadVersion(mid + 1, e);
    }
}
