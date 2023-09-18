// Sistema de plano telefônico onde:
// O sistema terá 03 planos: BASIC, MIDIA , TURBO;
// BASIC: 100 minutos de ligação;
// MÍDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;
// TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube.
package switchcase;
public class PlanoOperadora {
    public static void main(String[] args) {
            String plano = "M"; // M / T

            switch (plano) {
                case "T": {
                    System.out.println("5Gb Youtube");
                    break;
                }
                case "M": {
                    System.out.println("WhatsApp e Instagram grátis");
                    break;
                }
                case "B": {
                    System.out.println("100 minutos de ligação");
                    break;
                }
            }
        }
    }
