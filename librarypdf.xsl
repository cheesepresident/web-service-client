<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:fo="http://www.w3.org/1999/XSL/Format">

    <xsl:output method="xml" indent="yes"/>

    <xsl:template match="/">

        <fo:root>

            <fo:layout-master-set>
                <fo:simple-page-master master-name="A4"
                                       page-height="29.7cm"
                                       page-width="21cm"
                                       margin="2cm">

                    <fo:region-body/>
                </fo:simple-page-master>
            </fo:layout-master-set>

            <fo:page-sequence master-reference="A4">
                <fo:flow flow-name="xsl-region-body">

                    <fo:block text-align="left" space-after="15pt">
                        <fo:external-graphic src="url('logo.png')"
                                             content-width="100px"
                                             content-height="scale-to-fit"/>
                    </fo:block>

                    <fo:block font-size="18pt"
                              font-weight="bold"
                              color="#003366"
                              space-after="10pt">
                        Library Information
                    </fo:block>

                    <fo:block space-after="4pt">
                        <fo:inline font-weight="bold">Name: </fo:inline>
                        <xsl:value-of select="library/name"/>
                    </fo:block>

                    <fo:block space-after="4pt">
                        <fo:inline font-weight="bold">Location: </fo:inline>
                        <xsl:value-of select="library/location"/>
                    </fo:block>

                    <fo:block space-after="10pt">
                        <fo:inline font-weight="bold">City: </fo:inline>
                        <xsl:value-of select="library/city"/>
                    </fo:block>

                    <fo:block font-size="16pt"
                              font-weight="bold"
                              color="#003366"
                              space-before="10pt"
                              space-after="5pt">
                        Books
                    </fo:block>

                    <fo:table border="1pt solid #003366"
                              width="100%"
                              border-collapse="collapse">

                        <fo:table-column column-width="30%"/>
                        <fo:table-column column-width="25%"/>
                        <fo:table-column column-width="15%"/>
                        <fo:table-column column-width="30%"/>

                        <fo:table-header>
                            <fo:table-row background-color="#3366cc"
                                          color="white"
                                          font-weight="bold">

                                <fo:table-cell padding="6pt" border="1pt solid #003366">
                                    <fo:block>Title</fo:block>
                                </fo:table-cell>

                                <fo:table-cell padding="6pt" border="1pt solid #003366">
                                    <fo:block>Author</fo:block>
                                </fo:table-cell>

                                <fo:table-cell padding="6pt" border="1pt solid #003366">
                                    <fo:block>Year</fo:block>
                                </fo:table-cell>

                                <fo:table-cell padding="6pt" border="1pt solid #003366">
                                    <fo:block>ISBN</fo:block>
                                </fo:table-cell>

                            </fo:table-row>
                        </fo:table-header>

                        <fo:table-body>
                            <xsl:for-each select="library/books/book">

                                <fo:table-row background-color="#eef4ff">

                                    <fo:table-cell padding="6pt" border="1pt solid #003366">
                                        <fo:block>
                                            <xsl:value-of select="title"/>
                                        </fo:block>
                                    </fo:table-cell>

                                    <fo:table-cell padding="6pt" border="1pt solid #003366">
                                        <fo:block>
                                            <xsl:value-of select="author"/>
                                        </fo:block>
                                    </fo:table-cell>

                                    <fo:table-cell padding="6pt" border="1pt solid #003366">
                                        <fo:block>
                                            <xsl:value-of select="year"/>
                                        </fo:block>
                                    </fo:table-cell>

                                    <fo:table-cell padding="6pt" border="1pt solid #003366">
                                        <fo:block>
                                            <xsl:value-of select="isbn"/>
                                        </fo:block>
                                    </fo:table-cell>

                                </fo:table-row>

                            </xsl:for-each>
                        </fo:table-body>

                    </fo:table>

                </fo:flow>
            </fo:page-sequence>

        </fo:root>

    </xsl:template>

</xsl:stylesheet>