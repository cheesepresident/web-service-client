<?xml version="1.0"?>

<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/">
        <html>
            <head>
                <style>
                    table {
                    border-collapse: collapse;
                    width: 80%;
                    }
                    th, td {
                    border: 1px solid #1e2c45;
                    padding: 5px 10px;
                    }
                    th {
                    background-color: #85b1ff;
                    }
                    tr:nth-child(even) {
                    background-color: #c0d6fc;
                    }
                </style>
            </head>
            <body>
                <img width="5%" src="logo.png"/>
                <h2>
                    All books in <xsl:value-of select="library/name"/>,
                    located in <xsl:value-of select="library/location"/>,
                    <xsl:value-of select="library/city"/>
                </h2>

                <table>
                    <tr>
                        <th>Title</th>
                        <th>Author</th>
                        <th>Year</th>
                        <th>ISBN</th>
                    </tr>

                    <xsl:for-each select="library/books/book">
                        <tr>
                            <td><xsl:value-of select="title"/></td>
                            <td><xsl:value-of select="author"/></td>
                            <td><xsl:value-of select="year"/></td>
                            <td><xsl:value-of select="isbn"/></td>
                        </tr>
                    </xsl:for-each>

                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>