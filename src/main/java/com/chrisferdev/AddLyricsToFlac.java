package com.chrisferdev;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.flac.FlacFileReader;
import org.jaudiotagger.audio.flac.FlacFileWriter;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import java.io.File;

public class AddLyricsToFlac {

    public static void main(String[] args) {
        try {
            // Ruta al archivo FLAC
            File flacFile = new File("D:\\Music\\Coldplay\\[M]  Mylo Xyloto [8594942] [2011]\\03 - Coldplay - Paradise.flac");
            
            // Leer el archivo FLAC
            FlacFileReader flacFileReader = new FlacFileReader();
            AudioFile audioFile = flacFileReader.read(flacFile);
            Tag tag = audioFile.getTagOrCreateAndSetDefault();
            
            // Agregar letras al archivo FLAC
            String lyrics = "[00:54.82] Ooh-ooh-ooh, ooh-ooh-ooh, ooh-ooh-ooh\r\n" + //
                                "[00:58.14] Ooh-ooh-ooh, ooh-ooh-ooh, ooh-ooh-ooh\r\n" + //
                                "[01:01.74] When she was just a girl\r\n" + //
                                "[01:05.01] She expected the world\r\n" + //
                                "[01:08.05] But it flew away from her reach\r\n" + //
                                "[01:11.48] So she ran away in her sleep\r\n" + //
                                "[01:14.83] And dreamed of para-para-paradise\r\n" + //
                                "[01:19.06] Para-para-paradise\r\n" + //
                                "[01:22.25] Para-para-paradise\r\n" + //
                                "[01:25.69] Every time she closed her eyes\r\n" + //
                                "[01:30.32] \r\n" + //
                                "[01:36.02] Ooh-ooh-ooh, ooh-ooh-ooh, ooh-ooh-ooh\r\n" + //
                                "[01:39.56] Ooh-ooh-ooh, ooh-ooh-ooh, ooh-ooh-ooh\r\n" + //
                                "[01:42.97] When she was just a girl\r\n" + //
                                "[01:46.15] She expected the world\r\n" + //
                                "[01:49.46] But it flew away from her reach\r\n" + //
                                "[01:52.80] And the bullets catch in her teeth\r\n" + //
                                "[01:56.77] Life goes on, it gets so heavy\r\n" + //
                                "[01:59.93] The wheel breaks the butterfly\r\n" + //
                                "[02:03.50] Every tear, a waterfall\r\n" + //
                                "[02:06.57] In the night, the stormy night, she'd close her eyes\r\n" + //
                                "[02:13.35] In the night, the stormy night, away she'd fly\r\n" + //
                                "[02:20.22] And dream of para-para-paradise\r\n" + //
                                "[02:24.20] Para-para-paradise\r\n" + //
                                "[02:27.65] Para-para-paradise\r\n" + //
                                "[02:31.11] Oh-oh-oh-oh, oh-oh-oh-oh\r\n" + //
                                "[02:33.77] She'd dream of para-para-paradise\r\n" + //
                                "[02:37.91] Para-para-paradise\r\n" + //
                                "[02:41.36] Para-para-paradise\r\n" + //
                                "[02:44.88] Oh-oh-oh-oh, oh-oh-oh-oh\r\n" + //
                                "[02:48.99] \r\n" + //
                                "[03:01.89] La, la-la-la-la-la-la\r\n" + //
                                "[03:04.27] La-la-la-la-la-la, la-la-la-la-la, yeah\r\n" + //
                                "[03:07.90] So lying underneath those stormy skies\r\n" + //
                                "[03:14.93] She said, \"Oh, oh-oh-oh-oh, I know the sun must set to rise\"\r\n" + //
                                "[03:21.81] This could be para-para-paradise\r\n" + //
                                "[03:25.81] Para-para-paradise\r\n" + //
                                "[03:28.78] This could be para-para-paradise\r\n" + //
                                "[03:32.80] Oh-oh-oh-oh, oh-oh-oh-oh\r\n" + //
                                "[03:35.55] This could be para-para-paradise\r\n" + //
                                "[03:39.55] Para-para-paradise\r\n" + //
                                "[03:42.65] This could be para-para-paradise\r\n" + //
                                "[03:46.55] Oh-oh-oh-oh, oh-oh-oh-oh\r\n" + //
                                "[03:51.42] \r\n" + //
                                "[04:03.18] This could be para-para-paradise\r\n" + //
                                "[04:07.02] Para-para-paradise\r\n" + //
                                "[04:09.92] This could be para-para-paradise\r\n" + //
                                "[04:13.83] Oh-oh-oh-oh, oh-oh-oh-oh\r\n" + //
                                "[04:17.38] Ooh-ooh-ooh, ooh-ooh-ooh, ooh-ooh-ooh\r\n" + //
                                "[04:20.93] Ooh-ooh-ooh, ooh-ooh-ooh, ooh-ooh-ooh\r\n" + //
                                "[04:24.50] Ooh-ooh-ooh, ooh-ooh-ooh, ooh-ooh-ooh\r\n" + //
                                "[04:28.12] Ooh-ooh-ooh-ooh\r\n" + //
                                "[04:31.78] ";
                                
            tag.setField(FieldKey.LYRICS, lyrics);
            
            // Escribir los metadatos actualizados al archivo FLAC
            FlacFileWriter flacFileWriter = new FlacFileWriter();
            flacFileWriter.write(audioFile);
            
            System.out.println("Letras agregadas correctamente al archivo FLAC.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}