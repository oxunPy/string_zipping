package lithe;

import lithe.core.LitheString;

import java.nio.charset.StandardCharsets;

public class TestByMe {
    public static void main(String[] args) {
        String input = "ALJF ASDJ;J; jsdf nvx,cnv weopr psoefxcv.wep sifsdlwepi sfsdkw3- r20isdfs dfnsldf ksdf[svxmcv nx,mcwperi pwefsmd. sweprr we[opsnd, wer we32-403 0wslkd";
        byte[] compressed = LitheString.zip(input); // in the worst case, compressed is the plain UTF-8 encoding of input
        String uncompressed = LitheString.unzip(compressed);

        System.out.println(input);
        System.out.println(new String(compressed, StandardCharsets.UTF_8));
        System.out.println(input.length());
        System.out.println(new String(compressed, StandardCharsets.UTF_8).length());



    }
}
