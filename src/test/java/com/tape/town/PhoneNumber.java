package com.tape.town;

public final class PhoneNumber {
    private final short areaCode;
    private final short prefix;
    private final short lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix = rangeCheck(prefix, 999, "prefix");
        this.lineNum = rangeCheck(lineNum, 9999, "line num");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max) {
            throw new IllegalArgumentException(arg + ": " + val);
        }

        return (short) val;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof PhoneNumber)) {
            return false;
        }

        PhoneNumber pn = (PhoneNumber) obj;

        return pn.lineNum == lineNum && pn.prefix == prefix && pn.areaCode == areaCode;
    }

    @Override
    public int hashCode() {
        return formatHashCode(
            formatHashCode(Short.hashCode(areaCode), Short.hashCode(prefix)),
            Short.hashCode(lineNum)
        );
    }

    private int formatHashCode(int hash, int hash2) {
        return 31 * hash + hash2;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
            "areaCode=" + areaCode +
            ", prefix=" + prefix +
            ", lineNum=" + lineNum +
            '}';
    }
}
