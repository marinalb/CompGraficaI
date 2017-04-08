/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Marina
 */
public class ManipulacaoArquivos {

    public static ArrayList<ArrayList<String>> leArquivo(String caminho) {

        int tamanho = 0;
        String line = " ";
        String cvsSplitBy = ")";

        ArrayList<ArrayList<String>> listao = new ArrayList<ArrayList<String>>();
        ArrayList<String> pessoas = new ArrayList<String>();
        ArrayList<String> frames = new ArrayList<String>();
        //     int m[][] = new int[tamanho][]; 
        System.out.printf("\nConteúdo do arquivo texto:\n");
        try {
            FileReader arq = new FileReader(caminho);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine(); // lê a primeira linha
            // a variável "linha" recebe o valor "null" quando o processo
            // de repetição atingir o final do arquivo texto
            while (linha != null) {
                System.out.printf("%s\n", linha);

                linha = lerArq.readLine(); // lê da segunda até a última linha

                String[] coluna = line.split(cvsSplitBy);

                pessoas.add(coluna[1]);
                pessoas.add(coluna[2]);

                listao.add(pessoas);
           //     for (int x = 0; x < linha.length(); x++){
                //     for(int y = 0; y < linha.length(); y++){

                //     pessoas.add(" ");
                //        }
                //  }
            }
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
        return null;
    }

    public static void teste() {

        int tamanho;

        ArrayList j = new ArrayList();
        ArrayList i = new ArrayList();
        tamanho = 2;
        int m[][] = new int[tamanho][];

        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                j.add("marina1");
                j.add("chiclete1");
                i.add("linda2");
                i.add("chocolate2");

            }
        }

        System.out.println(j);
        System.out.println(i);

    }

    public static void readFile(String arquivo) {
        ArrayList<Posicao[]> lista = new ArrayList<>();        
        int proportion;
        int frames;        
        try (FileReader fr = new FileReader(new File(arquivo)); BufferedReader buff = new BufferedReader(fr)) {

            String linha = buff.readLine();
            while (linha != null) {
                if (linha.contains("[")) {
                    proportion = Integer.parseInt(linha.substring(linha.indexOf('[') + 1, linha.indexOf(']')));
                } else {
                    String[] aux = linha.split(("\t"));
                    frames = Integer.parseInt(aux[0]);
                    Pattern pat = Pattern.compile("([0-9]+,?)+");
                    Matcher mat = pat.matcher(aux[1]);
                    Posicao[] allMatches = new Posicao[frames];
                    for (int i = 0; i < allMatches.length; i++) {
                        mat.find();
                        String aux1[] = mat.group().split(",");
                        allMatches[i] = new Posicao(Integer.parseInt(aux1[0]), Integer.parseInt(aux1[1]), Integer.parseInt(aux1[2]));                        
                    }
                    lista.add(allMatches);
                }
                linha = buff.readLine();
            }
            Posicao[][] w = lista.toArray(new Posicao[][] {});           
        } catch (IOException ex) {
            System.out.println("eroo");
        }
    }

}
