package baekjoon.sliver;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class IAMPokemonMaster_1620 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] split = br.readLine().split(" ");
        int pokemons = Integer.parseInt(split[0]);
        int find = Integer.parseInt(split[1]);


        //1. Map 2개 Set으로 담고 List변환

        Map<String, Integer> pokemonName = new HashMap<>();
        Map<String, String> indexPokemon = new HashMap<>();
        //어떻게 담을껀지
        for (int index = 1; index <= pokemons; index++) {
            String pokemon = br.readLine();
            indexPokemon.put(String.valueOf(index), pokemon);
            pokemonName.put(pokemon, index);
        }

        //어떻게 찾을껀지!
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < find; i++) {
            String findPokemon = br.readLine();

            if (pokemonName.containsKey(findPokemon)) {
                sb.append(pokemonName.get(findPokemon)).append("\n");
            } else {
                sb.append(indexPokemon.get(findPokemon)).append("\n");
            }

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
