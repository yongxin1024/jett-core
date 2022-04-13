package net.sf.jett.model;

/**
 * <p><code>VerticalAlignments</code> represent the built-in vertical alignment
 * names that correspond with Excel's vertical alignment scheme.  These are
 * used in conjunction with the vertical alignment property in the style tag.
 * Legal values are the names of the enumeration objects, without underscores,
 * case insensitive, e.g. "justify" == "Justify" == "JUSTIFY".</p>
 *
 * @author Randy Gettman
 * @since 0.4.0
 * @see net.sf.jett.tag.StyleTag
 * @see net.sf.jett.parser.StyleParser#PROPERTY_VERTICAL_ALIGNMENT
 */
public enum VerticalAlignment
{
    BOTTOM     (org.apache.poi.ss.usermodel.VerticalAlignment.BOTTOM),
    CENTER     (org.apache.poi.ss.usermodel.VerticalAlignment.CENTER),
    DISTRIBUTED(org.apache.poi.ss.usermodel.VerticalAlignment.DISTRIBUTED),
    JUSTIFY    (org.apache.poi.ss.usermodel.VerticalAlignment.JUSTIFY),
    TOP        (org.apache.poi.ss.usermodel.VerticalAlignment.TOP);

    private org.apache.poi.ss.usermodel.VerticalAlignment myIndex;

    /**
     * Constructs a <code>VerticalAlignment</code>.
     * @param index The index.
     */
    VerticalAlignment(org.apache.poi.ss.usermodel.VerticalAlignment index)
    {
        myIndex = index;
    }

    /**
     * Returns the index.
     * @return The index.
     */
    public org.apache.poi.ss.usermodel.VerticalAlignment getIndex()
    {
        return myIndex;
    }

    /**
     * Returns the name, in all lowercase, no underscores or spaces.
     * @return The name, in all lowercase, no underscores or spaces.
     */
    public String toString()
    {
        return name().trim().toLowerCase().replace("_", "");
    }
}
