<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <!-- Plantilla raíz -->
    <xsl:template match="/">
        <html>
            <xsl:apply-templates/>
        </html>
    </xsl:template>

    <!-- Plantilla para el nodo principal -->
    <xsl:template match="Videojuegos">
        <head>
            <title>Lista de Videojuegos</title>
        </head>
        <body>
            <h1>Lista de Videojuegos</h1>
            <table border="1">
                <tr>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Género</th>
                    <th>Precio</th>
                    <th>Acabado</th>
                </tr>
                <!-- Aplicar plantilla a cada videojuego -->
                <xsl:apply-templates select="videojuego"/>
            </table>
        </body>
    </xsl:template>

    <!-- Plantilla para cada videojuego -->
    <xsl:template match="videojuego">
        <tr>
            <xsl:apply-templates/>
        </tr>
    </xsl:template>

    <!-- Plantillas para cada campo -->
    <xsl:template match="id|nombre|genero|precio|acabado">
        <td>
            <xsl:apply-templates/>
        </td>
    </xsl:template>

</xsl:stylesheet>
