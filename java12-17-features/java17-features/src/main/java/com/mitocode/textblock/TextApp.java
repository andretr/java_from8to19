package com.mitocode.textblock;

public class TextApp {

    private void m1Simple(){
        String text = """
                        Este es
                un texto                                         
                en bloque que no
                requiere operador +
                """;
        System.out.println(text);
    }

    public void m2Indentation(){
        String page = """
            <html>
                <body>
                    <span>example text</span>                    
                </body>
            </html>""";

        String json = """
            {
                "name": "mito",
                "age": 32,
                "status": true
            }
            """;


        System.out.println(page);
        System.out.println(json);
    }

    public void m3ScapeDoubleQuotes(){
        String text = """
                Suscribete al canal de "mitocode"
                y no te piedas del contenido \"
                """;

        System.out.println(text);
    }

    public void m4ScapeLinesTerminators(){
        String text = """
                    mitocode1.....
                    mitocode2.....\s
                """;
        System.out.println(text);
    }

    public void m5TextWithVariables(){
        String json = """
            {
                "name": "$name",
                "age": $age,
                "status": #status
            }
            """.replace("$name", "mitocode")
                .replace("$age", "32")
                .replace("#status", "true");

        String page = """
            <html>
                <body>
                    <span>Hi, %s</span>
                </body>
            </html>""".formatted("mitocode");

        System.out.println(json);
        System.out.println(page);
    }

    public static void main(String[] args) {
        TextApp app = new TextApp();
        app.m5TextWithVariables();
    }
}
