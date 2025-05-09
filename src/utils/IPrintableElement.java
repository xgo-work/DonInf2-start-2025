package utils;

public interface IPrintableElement {
    /**
     * @return The string representation of the element
     */
    String getPrintableString();
    /**
     * @return true if the element should be grayed out, false otherwise
     */
    boolean isGrayedOut();
}
