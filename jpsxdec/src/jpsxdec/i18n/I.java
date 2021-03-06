/*
 * jPSXdec Translations
 * Copyright (c) 2015 Michael Sabin, V�ctor Gonz�lez
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jpsxdec.i18n;

import java.util.Date;
import javax.annotation.Nonnull;

public class I {

    private static ILocalizedMessage inter(String sKey, String sEnglishDefault, Object ... aoArgs) {
        if (aoArgs.length == 0)
            return new LocalizedMessage(sKey, sEnglishDefault);
        else
            return new LocalizedMessage(sKey, sEnglishDefault, aoArgs);
    }

    /**
    <table border="1"><tr><td>
    <pre>Sector {0,number,#} chunks in frame changed from {1,number,#} to {2,number,#}</pre>
    </td></tr></table>
    <ul>
       <li>AbstractDemuxedStrFrame.java</li>
    </ul>
    */
    public static ILocalizedMessage DEMUX_FRAME_CHUNKS_CHANGED_FROM_TO(int sectorNumber, int currentChunkCount, int newChunkCount) {
        return inter("DEMUX_FRAME_CHUNKS_CHANGED_FROM_TO", "Sector {0,number,#} chunks in frame changed from {1,number,#} to {2,number,#}", sectorNumber, currentChunkCount, newChunkCount);
    }

    /**
    <table border="1"><tr><td>
    <pre>Sector {0,number,#} chunk number {1,number,#} &gt;= chunks in frame {2,number,#}</pre>
    </td></tr></table>
    <ul>
       <li>AbstractDemuxedStrFrame.java</li>
    </ul>
    */
    public static ILocalizedMessage DEMUX_CHUNK_NUM_GTE_CHUNKS_IN_FRAME(int sectorNumber, int chunkNumber, int chunksInFrame) {
        return inter("DEMUX_CHUNK_NUM_GTE_CHUNKS_IN_FRAME", "Sector {0,number,#} chunk number {1,number,#} >= chunks in frame {2,number,#}", sectorNumber, chunkNumber, chunksInFrame);
    }

    /**
    <table border="1"><tr><td>
    <pre>Trying to replace a frame with missing chunks??</pre>
    </td></tr></table>
    <ul>
       <li>AbstractDemuxedStrFrame.java</li>
       <li>DemuxedCrusaderFrame.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_FRAME_TO_REPLACE_MISSING_CHUNKS() {
        return inter("CMD_FRAME_TO_REPLACE_MISSING_CHUNKS", "Trying to replace a frame with missing chunks??");
    }

    /**
    <table border="1"><tr><td>
    <pre>Format: {0}</pre>
    </td></tr></table>
    <ul>
       <li>AudioSaver.java</li>
       <li>SpuSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_AUDIO_FORMAT(@Nonnull ILocalizedMessage audioFormat) {
        return inter("CMD_AUDIO_FORMAT", "Format: {0}", audioFormat);
    }

    /**
    <table border="1"><tr><td>
    <pre>Volume: {0,number,#%}%</pre>
    </td></tr></table>
    <p>Value between 0.0 and 1.0</p>
    <ul>
       <li>AudioSaver.java</li>
       <li>SpuSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_VOLUME_PERCENT(double volumeLevelPercent) {
        return inter("CMD_VOLUME_PERCENT", "Volume: {0,number,#%}%", volumeLevelPercent);
    }

    /**
    <table border="1"><tr><td>
    <pre>Filename: {0}</pre>
    </td></tr></table>
    <ul>
       <li>AudioSaver.java</li>
       <li>SpuSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_FILENAME(@Nonnull java.io.File fileName) {
        return inter("CMD_FILENAME", "Filename: {0}", fileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>-audfmt,-af &lt;format&gt;</pre>
    </td></tr></table>
    <p>Note that the commands -audfmt and -af are hard-coded</p>
    <ul>
       <li>AudioSaverBuilder.java</li>
       <li>SpuSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_AUDIO_AF() {
        return inter("CMD_AUDIO_AF", "-audfmt,-af <format>");
    }

    /**
    <table border="1"><tr><td>
    <pre>Output audio format (default {0}). Options:</pre>
    </td></tr></table>
    <ul>
       <li>AudioSaverBuilder.java</li>
       <li>SpuSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_AUDIO_AF_HELP(@Nonnull String defaultAudioFormatName) {
        return inter("CMD_AUDIO_AF_HELP", "Output audio format (default {0}). Options:", defaultAudioFormatName);
    }

    /**
    <table border="1"><tr><td>
    <pre>-vol &lt;0-100&gt;</pre>
    </td></tr></table>
    <p>Note that the command -vol is hard-coded</p>
    <ul>
       <li>AudioSaverBuilder.java</li>
       <li>SpuSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_AUDIO_VOL() {
        return inter("CMD_AUDIO_VOL", "-vol <0-100>");
    }

    /**
    <table border="1"><tr><td>
    <pre>Adjust volume (default {0,number,#}).</pre>
    </td></tr></table>
    <p>Value between 0 and 100</p>
    <ul>
       <li>AudioSaverBuilder.java</li>
       <li>SpuSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_AUDIO_VOL_HELP(int defaultVolumeLevel) {
        return inter("CMD_AUDIO_VOL_HELP", "Adjust volume (default {0,number,#}).", defaultVolumeLevel);
    }

    /**
    <table border="1"><tr><td>
    <pre>Ignoring invalid format {0}</pre>
    </td></tr></table>
    <ul>
       <li>AudioSaverBuilder.java</li>
       <li>SpuSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_IGNORING_INVALID_FORMAT(@Nonnull String invalidFormatName) {
        return inter("CMD_IGNORING_INVALID_FORMAT", "Ignoring invalid format {0}", invalidFormatName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Ignoring invalid volume {0}</pre>
    </td></tr></table>
    <ul>
       <li>AudioSaverBuilder.java</li>
       <li>SpuSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_IGNORING_INVALID_VOLUME(@Nonnull String invalidVolume) {
        return inter("CMD_IGNORING_INVALID_VOLUME", "Ignoring invalid volume {0}", invalidVolume);
    }

    /**
    <table border="1"><tr><td>
    <pre>Ignoring invalid disc speed {0}</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_IGNORING_INVALID_DISC_SPEED(@Nonnull String badDiscSpeed) {
        return inter("CMD_IGNORING_INVALID_DISC_SPEED", "Ignoring invalid disc speed {0}", badDiscSpeed);
    }

    /**
    <table border="1"><tr><td>
    <pre>Volume:</pre>
    </td></tr></table>
    <ul>
       <li>AudioSaverBuilderGui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_VOLUME_LABEL() {
        return inter("GUI_VOLUME_LABEL", "Volume:");
    }

    /**
    <table border="1"><tr><td>
    <pre>Avi file is closed</pre>
    </td></tr></table>
    <ul>
       <li>AviWriter.java</li>
    </ul>
    */
    public static ILocalizedMessage AVI_FILE_IS_CLOSED() {
        return inter("AVI_FILE_IS_CLOSED", "Avi file is closed");
    }

    /**
    <table border="1"><tr><td>
    <pre>JFIF header not found in jpeg data, unable to write frame to AVI.</pre>
    </td></tr></table>
    <ul>
       <li>AviWriterMJPG.java</li>
    </ul>
    */
    public static ILocalizedMessage AVI_JPEG_JFIF_HEADER_MISSING() {
        return inter("AVI_JPEG_JFIF_HEADER_MISSING", "JFIF header not found in jpeg data, unable to write frame to AVI.");
    }

    /**
    <table border="1"><tr><td>
    <pre>The file &quot;{0}&quot; already exists!
Do you want to replace it?</pre>
    </td></tr></table>
    <ul>
       <li>BetterFileChooser.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_FILE_EXISTS_REPLACE(@Nonnull String fileName) {
        return inter("GUI_FILE_EXISTS_REPLACE", "The file \"{0}\" already exists!\nDo you want to replace it?", fileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Frame is not Iki format</pre>
    </td></tr></table>
    */
    public static ILocalizedMessage FRAME_NOT_IKI() {
        return inter("FRAME_NOT_IKI", "Frame is not Iki format");
    }

    /**
    <table border="1"><tr><td>
    <pre>Trying to reduce Qscale of ({0,number,#},{1,number,#}) to {2,number,#}</pre>
    </td></tr></table>
    <ul>
       <li>BitStreamUncompressor_Iki.java</li>
    </ul>
    */
    public static ILocalizedMessage IKI_REDUCING_QSCALE_OF_MB_TO_VAL(int macroBlockX, int macroBlockY, int quantizationScale) {
        return inter("IKI_REDUCING_QSCALE_OF_MB_TO_VAL", "Trying to reduce Qscale of ({0,number,#},{1,number,#}) to {2,number,#}", macroBlockX, macroBlockY, quantizationScale);
    }

    /**
    <table border="1"><tr><td>
    <pre>New frame {0} demux size {1,number,#} &gt; max source {2,number,#}, so stopping</pre>
    </td></tr></table>
    <ul>
       <li>BitStreamUncompressor_Iki.java</li>
    </ul>
    */
    public static ILocalizedMessage IKI_NEW_FRAME_GT_SRC_STOPPING(@Nonnull String frameNumber, int demuxSize, int sourceSize) {
        return inter("IKI_NEW_FRAME_GT_SRC_STOPPING", "New frame {0} demux size {1,number,#} > max source {2,number,#}, so stopping", frameNumber, demuxSize, sourceSize);
    }

    /**
    <table border="1"><tr><td>
    <pre>New frame {0} demux size {1,number,#} &lt;= max source {2,number,#}</pre>
    </td></tr></table>
    <ul>
       <li>BitStreamUncompressor_Iki.java</li>
       <li>BitStreamUncompressor_Lain.java</li>
       <li>BitStreamUncompressor_STRv2.java</li>
    </ul>
    */
    public static ILocalizedMessage NEW_FRAME_FITS(@Nonnull String frameNumber, int demuxSize, int sourceSize) {
        return inter("NEW_FRAME_FITS", "New frame {0} demux size {1,number,#} <= max source {2,number,#}", frameNumber, demuxSize, sourceSize);
    }

    /**
    <table border="1"><tr><td>
    <pre>Trying {0,number,#}</pre>
    </td></tr></table>
    <ul>
       <li>BitStreamUncompressor_Iki.java</li>
       <li>BitStreamUncompressor_STRv2.java</li>
    </ul>
    */
    public static ILocalizedMessage TRYING_QSCALE(int quantizationScale) {
        return inter("TRYING_QSCALE", "Trying {0,number,#}", quantizationScale);
    }

    /**
    <table border="1"><tr><td>
    <pre>End of stream</pre>
    </td></tr></table>
    */
    public static ILocalizedMessage END_OF_STREAM() {
        return inter("END_OF_STREAM", "End of stream");
    }

    /**
    <table border="1"><tr><td>
    <pre>Trying luma {0,number,#} chroma {1,number,#}</pre>
    </td></tr></table>
    <ul>
       <li>BitStreamUncompressor_Lain.java</li>
    </ul>
    */
    public static ILocalizedMessage TRYING_LUMA_CHROMA(int lumaQuantizationScale, int chromaQuantizationScale) {
        return inter("TRYING_LUMA_CHROMA", "Trying luma {0,number,#} chroma {1,number,#}", lumaQuantizationScale, chromaQuantizationScale);
    }

    /**
    <table border="1"><tr><td>
    <pre>!!! New frame {0} demux size {1,number,#} &gt; max source {2,number,#} !!!</pre>
    </td></tr></table>
    <ul>
       <li>ReplaceFrame.java</li>
       <li>BitStreamUncompressor_Iki.java</li>
       <li>BitStreamUncompressor_Lain.java</li>
       <li>BitStreamUncompressor_STRv2.java</li>
    </ul>
    */
    public static ILocalizedMessage NEW_FRAME_DOES_NOT_FIT(@Nonnull String frameNumber, int newFrameSize, int sourceFrameSize) {
        return inter("NEW_FRAME_DOES_NOT_FIT", "!!! New frame {0} demux size {1,number,#} > max source {2,number,#} !!!", frameNumber, newFrameSize, sourceFrameSize);
    }

    /**
    <table border="1"><tr><td>
    <pre>Video format cannot handle the magnitude of the new data for frame {0}</pre>
    </td></tr></table>
    <ul>
       <li>BitStreamUncompressor_Lain.java</li>
    </ul>
    */
    public static ILocalizedMessage COMPRESS_TOO_MUCH_ENERGY(@Nonnull String frameNumber) {
        return inter("COMPRESS_TOO_MUCH_ENERGY", "Video format cannot handle the magnitude of the new data for frame {0}", frameNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Frame is not Lain format</pre>
    </td></tr></table>
    <ul>
       <li>BitStreamUncompressor_Lain.java</li>
    </ul>
    */
    public static ILocalizedMessage FRAME_NOT_LAIN() {
        return inter("FRAME_NOT_LAIN", "Frame is not Lain format");
    }

    /**
    <table border="1"><tr><td>
    <pre>Frame is not STRv1 format</pre>
    </td></tr></table>
    <ul>
       <li>BitStreamUncompressor_STRv1.java</li>
    </ul>
    */
    public static ILocalizedMessage FRAME_NOT_STRV1() {
        return inter("FRAME_NOT_STRV1", "Frame is not STRv1 format");
    }

    /**
    <table border="1"><tr><td>
    <pre>Frame is not STRv2 format</pre>
    </td></tr></table>
    <ul>
       <li>BitStreamUncompressor_STRv2.java</li>
    </ul>
    */
    public static ILocalizedMessage FRAME_NOT_STRV2() {
        return inter("FRAME_NOT_STRV2", "Frame is not STRv2 format");
    }

    /**
    <table border="1"><tr><td>
    <pre>Frame is not STRv3 format</pre>
    </td></tr></table>
    <ul>
       <li>BitStreamUncompressor_STRv3.java</li>
    </ul>
    */
    public static ILocalizedMessage FRAME_NOT_STRV3() {
        return inter("FRAME_NOT_STRV3", "Frame is not STRv3 format");
    }

    /**
    <table border="1"><tr><td>
    <pre>Serialized sector count {0,number,#} does not match actual {1,number,#}</pre>
    </td></tr></table>
    <ul>
       <li>CdFileSectorReader.java</li>
    </ul>
    */
    public static ILocalizedMessage SECTOR_COUNT_MISMATCH(int serializedCount, int actualCount) {
        return inter("SECTOR_COUNT_MISMATCH", "Serialized sector count {0,number,#} does not match actual {1,number,#}", serializedCount, actualCount);
    }

    /**
    <table border="1"><tr><td>
    <pre>Failed to deserialize CD string: {0}</pre>
    </td></tr></table>
    <ul>
       <li>CdFileSectorReader.java</li>
    </ul>
    */
    public static ILocalizedMessage CD_DESERIALIZE_FAIL(@Nonnull String badSerializedString) {
        return inter("CD_DESERIALIZE_FAIL", "Failed to deserialize CD string: {0}", badSerializedString);
    }

    /**
    <table border="1"><tr><td>
    <pre>.iso (2048 bytes/sector) format</pre>
    </td></tr></table>
    <ul>
       <li>CdFileSectorReader.java</li>
    </ul>
    */
    public static ILocalizedMessage CD_FORMAT_2048() {
        return inter("CD_FORMAT_2048", ".iso (2048 bytes/sector) format");
    }

    /**
    <table border="1"><tr><td>
    <pre>partial header (2336 bytes/sector) format</pre>
    </td></tr></table>
    <ul>
       <li>CdFileSectorReader.java</li>
    </ul>
    */
    public static ILocalizedMessage CD_FORMAT_2336() {
        return inter("CD_FORMAT_2336", "partial header (2336 bytes/sector) format");
    }

    /**
    <table border="1"><tr><td>
    <pre>BIN/CUE + Sub Channel (2448 bytes/sector) format</pre>
    </td></tr></table>
    <ul>
       <li>CdFileSectorReader.java</li>
    </ul>
    */
    public static ILocalizedMessage CD_FORMAT_2448() {
        return inter("CD_FORMAT_2448", "BIN/CUE + Sub Channel (2448 bytes/sector) format");
    }

    /**
    <table border="1"><tr><td>
    <pre>BIN/CUE (2352 bytes/sector) format</pre>
    </td></tr></table>
    <ul>
       <li>CdFileSectorReader.java</li>
    </ul>
    */
    public static ILocalizedMessage CD_FORMAT_2352() {
        return inter("CD_FORMAT_2352", "BIN/CUE (2352 bytes/sector) format");
    }

    /**
    <table border="1"><tr><td>
    <pre>Failed to read at least 1 entire sector.</pre>
    </td></tr></table>
    <ul>
       <li>CdFileSectorReader.java</li>
    </ul>
    */
    public static ILocalizedMessage FAILED_TO_READ_1_SECTOR() {
        return inter("FAILED_TO_READ_1_SECTOR", "Failed to read at least 1 entire sector.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Invalid sector range: {0}</pre>
    </td></tr></table>
    <ul>
       <li>Command_CopySect.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_SECTOR_RANGE_INVALID(@Nonnull String badSectorRangeString) {
        return inter("CMD_SECTOR_RANGE_INVALID", "Invalid sector range: {0}", badSectorRangeString);
    }

    /**
    <table border="1"><tr><td>
    <pre>Copying sectors {0,number,#} - {1,number,#} to {2}</pre>
    </td></tr></table>
    <ul>
       <li>Command_CopySect.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_COPYING_SECTOR(int startSector, int endSector, @Nonnull String destinationFile) {
        return inter("CMD_COPYING_SECTOR", "Copying sectors {0,number,#} - {1,number,#} to {2}", startSector, endSector, destinationFile);
    }

    /**
    <table border="1"><tr><td>
    <pre>Sorry, couldn''t find any disc items of type {0}</pre>
    </td></tr></table>
    <ul>
       <li>Command_Items.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_NO_ITEMS_OF_TYPE(@Nonnull String discItemType) {
        return inter("CMD_NO_ITEMS_OF_TYPE", "Sorry, couldn''t find any disc items of type {0}", discItemType);
    }

    /**
    <table border="1"><tr><td>
    <pre>Item complete.</pre>
    </td></tr></table>
    <ul>
       <li>Command_Items.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_ITEM_COMPLETE() {
        return inter("CMD_ITEM_COMPLETE", "Item complete.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Could not find disc item {0,number,#}</pre>
    </td></tr></table>
    <ul>
       <li>Command_Items.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_DISC_ITEM_NOT_FOUND_NUM(int discItemIndex) {
        return inter("CMD_DISC_ITEM_NOT_FOUND_NUM", "Could not find disc item {0,number,#}", discItemIndex);
    }

    /**
    <table border="1"><tr><td>
    <pre>Could not find disc item {0}</pre>
    </td></tr></table>
    <ul>
       <li>Command_Items.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_DISC_ITEM_NOT_FOUND_STR(@Nonnull String discItemId) {
        return inter("CMD_DISC_ITEM_NOT_FOUND_STR", "Could not find disc item {0}", discItemId);
    }

    /**
    <table border="1"><tr><td>
    <pre>Detailed help for</pre>
    </td></tr></table>
    <p>The next line will display the item info</p>
    <ul>
       <li>Command_Items.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_DETAILED_HELP_FOR() {
        return inter("CMD_DETAILED_HELP_FOR", "Detailed help for");
    }

    /**
    <table border="1"><tr><td>
    <pre>Invalid item number: {0}</pre>
    </td></tr></table>
    <ul>
       <li>Command_Items.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_ITEM_NUMBER_INVALID(@Nonnull String badItemNumber) {
        return inter("CMD_ITEM_NUMBER_INVALID", "Invalid item number: {0}", badItemNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Unable to replace a TIM image that has multiple palettes.</pre>
    </td></tr></table>
    <ul>
       <li>Command_Items.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_UNABLE_TO_REPLACE_MULTI_PAL_TIM() {
        return inter("CMD_UNABLE_TO_REPLACE_MULTI_PAL_TIM", "Unable to replace a TIM image that has multiple palettes.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Reopening disc image with write access.</pre>
    </td></tr></table>
    <ul>
       <li>Command_Items.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_REOPENING_DISC_WRITE_ACCESS() {
        return inter("CMD_REOPENING_DISC_WRITE_ACCESS", "Reopening disc image with write access.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Disc item is not audio or video. Cannot create player.</pre>
    </td></tr></table>
    */
    public static ILocalizedMessage CMD_DISC_ITEM_NOT_AUDIO_VIDEO_NO_PLAYER() {
        return inter("CMD_DISC_ITEM_NOT_AUDIO_VIDEO_NO_PLAYER", "Disc item is not audio or video. Cannot create player.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Time: {0,number,#.##} sec</pre>
    </td></tr></table>
    <ul>
       <li>Command_Items.java</li>
       <li>DiscIndex.java</li>
    </ul>
    */
    public static ILocalizedMessage PROCESS_TIME(double durationInSeconds) {
        return inter("PROCESS_TIME", "Time: {0,number,#.##} sec", durationInSeconds);
    }

    /**
    <table border="1"><tr><td>
    <pre>All index items complete.</pre>
    </td></tr></table>
    <ul>
       <li>Command_Items.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_ALL_ITEMS_COMPLETE() {
        return inter("CMD_ALL_ITEMS_COMPLETE", "All index items complete.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Invalid item identifier: {0}</pre>
    </td></tr></table>
    <ul>
       <li>Command_Items.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_ITEM_ID_INVALID(@Nonnull String badItemIdentifier) {
        return inter("CMD_ITEM_ID_INVALID", "Invalid item identifier: {0}", badItemIdentifier);
    }

    /**
    <table border="1"><tr><td>
    <pre>Hope your disc image is backed up because this is irreversible.</pre>
    </td></tr></table>
    <ul>
       <li>Command_Items.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_BACKUP_DISC_IMAGE_WARNING() {
        return inter("CMD_BACKUP_DISC_IMAGE_WARNING", "Hope your disc image is backed up because this is irreversible.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Error with player</pre>
    </td></tr></table>
    */
    public static ILocalizedMessage CMD_PLAYER_ERR() {
        return inter("CMD_PLAYER_ERR", "Error with player");
    }

    /**
    <table border="1"><tr><td>
    <pre>Disc item isn't a video.</pre>
    </td></tr></table>
    <ul>
       <li>Command_Items.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_DISC_ITEM_NOT_VIDEO() {
        return inter("CMD_DISC_ITEM_NOT_VIDEO", "Disc item isn't a video.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Disc item isn't a XA stream.</pre>
    </td></tr></table>
    <ul>
       <li>Command_Items.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_DISC_ITEM_NOT_XA() {
        return inter("CMD_DISC_ITEM_NOT_XA", "Disc item isn't a XA stream.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Disc item isn't a TIM image.</pre>
    </td></tr></table>
    <ul>
       <li>Command_Items.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_DISC_ITEM_NOT_TIM() {
        return inter("CMD_DISC_ITEM_NOT_TIM", "Disc item isn't a TIM image.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Invalid or missing XA item number {0}</pre>
    </td></tr></table>
    <ul>
       <li>Command_Items.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_XA_REPLACE_BAD_ITEM_NUM(@Nonnull String badItemNumber) {
        return inter("CMD_XA_REPLACE_BAD_ITEM_NUM", "Invalid or missing XA item number {0}", badItemNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Disc decoding/extracting complete.</pre>
    </td></tr></table>
    <ul>
       <li>Command_Items.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_PROCESS_COMPLETE() {
        return inter("CMD_PROCESS_COMPLETE", "Disc decoding/extracting complete.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Creating player for</pre>
    </td></tr></table>
    <p>The next line will display the item info</p>
    */
    public static ILocalizedMessage CMD_CREATING_PLAYER() {
        return inter("CMD_CREATING_PLAYER", "Creating player for");
    }

    /**
    <table border="1"><tr><td>
    <pre>Opening patch index {0}</pre>
    </td></tr></table>
    <ul>
       <li>Command_Items.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_XA_REPLACE_OPENING_PATCH_IDX(@Nonnull String patchIndexFileName) {
        return inter("CMD_XA_REPLACE_OPENING_PATCH_IDX", "Opening patch index {0}", patchIndexFileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Saving {0}</pre>
    </td></tr></table>
    <ul>
       <li>Command_Items.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_SAVING(@Nonnull jpsxdec.discitems.DiscItem discItem) {
        return inter("CMD_SAVING", "Saving {0}", discItem);
    }

    /**
    <table border="1"><tr><td>
    <pre>{0,choice,0#No files created|1#1 file created|2#{0} files created}</pre>
    </td></tr></table>
    <ul>
       <li>Command_Items.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_NUM_FILES_CREATED(int fileCount) {
        return inter("CMD_NUM_FILES_CREATED", "{0,choice,0#No files created|1#1 file created|2#{0} files created}", fileCount);
    }

    /**
    <table border="1"><tr><td>
    <pre>jPSXdec: PSX media decoder (non-commercial) v{0} - Player</pre>
    </td></tr></table>
    */
    public static ILocalizedMessage JPSXDEC_PLAYER_WIN_TITLE_POSTFIX(@Nonnull String version) {
        return inter("JPSXDEC_PLAYER_WIN_TITLE_POSTFIX", "jPSXdec: PSX media decoder (non-commercial) v{0} - Player", version);
    }

    /**
    <table border="1"><tr><td>
    <pre>save</pre>
    </td></tr></table>
    <p>The base name of the log file that will be created, e.g. &quot;save.log&quot;</p>
    <ul>
       <li>Command_Items.java</li>
    </ul>
    */
    public static ILocalizedMessage SAVE_LOG_FILE_BASE_NAME() {
        return inter("SAVE_LOG_FILE_BASE_NAME", "save");
    }

    /**
    <table border="1"><tr><td>
    <pre>index</pre>
    </td></tr></table>
    <p>The base name of the log file that will be created, e.g. &quot;index.log&quot;</p>
    <ul>
       <li>Command.java</li>
       <li>CommandLine.java</li>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage INDEX_LOG_FILE_BASE_NAME() {
        return inter("INDEX_LOG_FILE_BASE_NAME", "index");
    }

    /**
    <table border="1"><tr><td>
    <pre>replace</pre>
    </td></tr></table>
    <p>The base name of the log file that will be created, e.g. &quot;replace.log&quot;</p>
    <ul>
       <li>Command_Items.java</li>
    </ul>
    */
    public static ILocalizedMessage REPLACE_LOG_FILE_BASE_NAME() {
        return inter("REPLACE_LOG_FILE_BASE_NAME", "replace");
    }

    /**
    <table border="1"><tr><td>
    <pre>Play</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_PLAY_BTN() {
        return inter("GUI_PLAY_BTN", "Play");
    }

    /**
    <table border="1"><tr><td>
    <pre>Generating sector list</pre>
    </td></tr></table>
    <ul>
       <li>Command_SectorDump.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_GENERATING_SECTOR_LIST() {
        return inter("CMD_GENERATING_SECTOR_LIST", "Generating sector list");
    }

    /**
    <table border="1"><tr><td>
    <pre>-dim option required</pre>
    </td></tr></table>
    <ul>
       <li>Command_Static.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_DIM_OPTION_REQURIED() {
        return inter("CMD_DIM_OPTION_REQURIED", "-dim option required");
    }

    /**
    <table border="1"><tr><td>
    <pre>Invalid quality {0}</pre>
    </td></tr></table>
    <ul>
       <li>Command_Static.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_QUALITY_INVALID(@Nonnull String badQuality) {
        return inter("CMD_QUALITY_INVALID", "Invalid quality {0}", badQuality);
    }

    /**
    <table border="1"><tr><td>
    <pre>Using quality {0}</pre>
    </td></tr></table>
    <ul>
       <li>Command_Static.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_USING_QUALITY(@Nonnull ILocalizedMessage qualityName) {
        return inter("CMD_USING_QUALITY", "Using quality {0}", qualityName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Error: not a Tim image</pre>
    </td></tr></table>
    <ul>
       <li>Command_Static.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_NOT_TIM() {
        return inter("CMD_NOT_TIM", "Error: not a Tim image");
    }

    /**
    <table border="1"><tr><td>
    <pre>Using upsampling {0}</pre>
    </td></tr></table>
    <p>See CHROMA_UPSAMPLE_*_DESCRIPTION</p>
    <ul>
       <li>Command_Static.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_USING_UPSAMPLING(@Nonnull ILocalizedMessage upsampleDescription) {
        return inter("CMD_USING_UPSAMPLING", "Using upsampling {0}", upsampleDescription);
    }

    /**
    <table border="1"><tr><td>
    <pre>Error reading or writing TIM file</pre>
    </td></tr></table>
    <ul>
       <li>Command_Static.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_TIM_IO_ERR() {
        return inter("CMD_TIM_IO_ERR", "Error reading or writing TIM file");
    }

    /**
    <table border="1"><tr><td>
    <pre>Invalid format type {0}</pre>
    </td></tr></table>
    <ul>
       <li>Command_Static.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_FORMAT_INVALID(@Nonnull String badFormat) {
        return inter("CMD_FORMAT_INVALID", "Invalid format type {0}", badFormat);
    }

    /**
    <table border="1"><tr><td>
    <pre>Unable to enable decoding debug because asserts are disabled.</pre>
    </td></tr></table>
    <p>Right after this string, the next string (CMD_ASSERT_DISABLED_NO_DEBUG_USE_EA) is shown [TODO: combine these strings into 1]</p>
    <ul>
       <li>Command_Static.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_ASSERT_DISABLED_NO_DEBUG() {
        return inter("CMD_ASSERT_DISABLED_NO_DEBUG", "Unable to enable decoding debug because asserts are disabled.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Start java using the -ea option.</pre>
    </td></tr></table>
    <ul>
       <li>Command_Static.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_ASSERT_DISABLED_NO_DEBUG_USE_EA() {
        return inter("CMD_ASSERT_DISABLED_NO_DEBUG_USE_EA", "Start java using the -ea option.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Reading TIM file {0}</pre>
    </td></tr></table>
    <ul>
       <li>Command_Static.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_READING_TIM(@Nonnull java.io.File timFileName) {
        return inter("CMD_READING_TIM", "Reading TIM file {0}", timFileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Invalid static type: {0}</pre>
    </td></tr></table>
    <ul>
       <li>Command_Static.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_STATIC_TYPE_INVALID(@Nonnull String badStaticTypeName) {
        return inter("CMD_STATIC_TYPE_INVALID", "Invalid static type: {0}", badStaticTypeName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Frame converted successfully.</pre>
    </td></tr></table>
    <ul>
       <li>Command_Static.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_FRAME_CONVERT_OK() {
        return inter("CMD_FRAME_CONVERT_OK", "Frame converted successfully.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Reading static file {0}</pre>
    </td></tr></table>
    <ul>
       <li>Command_Static.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_READING_STATIC_FILE(@Nonnull java.io.File fileName) {
        return inter("CMD_READING_STATIC_FILE", "Reading static file {0}", fileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Image converted successfully</pre>
    </td></tr></table>
    <ul>
       <li>Command_Static.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_IMAGE_CONVERT_OK() {
        return inter("CMD_IMAGE_CONVERT_OK", "Image converted successfully");
    }

    /**
    <table border="1"><tr><td>
    <pre>Invalid upsampling {0}</pre>
    </td></tr></table>
    <ul>
       <li>Command_Static.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_UPSAMPLING_INVALID(@Nonnull String badUpsamplingName) {
        return inter("CMD_UPSAMPLING_INVALID", "Invalid upsampling {0}", badUpsamplingName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Saving as: {0}</pre>
    </td></tr></table>
    <ul>
       <li>Command_Static.java</li>
       <li>VideoSaver.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_SAVING_AS(@Nonnull java.io.File fileName) {
        return inter("CMD_SAVING_AS", "Saving as: {0}", fileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Generating visualization</pre>
    </td></tr></table>
    <ul>
       <li>Command_Visualize.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_GENERATING_VISUALIZATION() {
        return inter("CMD_GENERATING_VISUALIZATION", "Generating visualization");
    }

    /**
    <table border="1"><tr><td>
    <pre>Error creating or writing the visualization</pre>
    </td></tr></table>
    <ul>
       <li>Command_Visualize.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_VISUALIZATION_ERR() {
        return inter("CMD_VISUALIZATION_ERR", "Error creating or writing the visualization");
    }

    /**
    <table border="1"><tr><td>
    <pre>Using source file {0}</pre>
    </td></tr></table>
    <ul>
       <li>Command.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_USING_SRC_FILE(@Nonnull java.io.File sourceFileName) {
        return inter("CMD_USING_SRC_FILE", "Using source file {0}", sourceFileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Need a input file and/or index file to load.</pre>
    </td></tr></table>
    <ul>
       <li>Command.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_NEED_INPUT_OR_INDEX() {
        return inter("CMD_NEED_INPUT_OR_INDEX", "Need a input file and/or index file to load.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Input file disc image required for this command.</pre>
    </td></tr></table>
    <ul>
       <li>Command.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_DISC_FILE_REQUIRED() {
        return inter("CMD_DISC_FILE_REQUIRED", "Input file disc image required for this command.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Input file is required for this command.</pre>
    </td></tr></table>
    <ul>
       <li>Command.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_INPUT_FILE_REQUIRED() {
        return inter("CMD_INPUT_FILE_REQUIRED", "Input file is required for this command.");
    }

    /**
    <table border="1"><tr><td>
    <pre>{0,number,#} items loaded.</pre>
    </td></tr></table>
    <ul>
       <li>Command.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_ITEMS_LOADED(int itemCount) {
        return inter("CMD_ITEMS_LOADED", "{0,number,#} items loaded.", itemCount);
    }

    /**
    <table border="1"><tr><td>
    <pre>Reading index file {0}</pre>
    </td></tr></table>
    <ul>
       <li>Command.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_READING_INDEX_FILE(@Nonnull String fileName) {
        return inter("CMD_READING_INDEX_FILE", "Reading index file {0}", fileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Input file not found {0}</pre>
    </td></tr></table>
    <ul>
       <li>Command.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_INPUT_FILE_NOT_FOUND(@Nonnull java.io.File fileName) {
        return inter("CMD_INPUT_FILE_NOT_FOUND", "Input file not found {0}", fileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Error loading index file</pre>
    </td></tr></table>
    <ul>
       <li>Command.java</li>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage ERR_LOADING_INDEX_FILE() {
        return inter("ERR_LOADING_INDEX_FILE", "Error loading index file");
    }

    /**
    <table border="1"><tr><td>
    <pre>{0,number,#} items found</pre>
    </td></tr></table>
    <ul>
       <li>CommandLine.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_NUM_ITEMS_FOUND(int itemCount) {
        return inter("CMD_NUM_ITEMS_FOUND", "{0,number,#} items found", itemCount);
    }

    /**
    <table border="1"><tr><td>
    <pre>Building index</pre>
    </td></tr></table>
    <ul>
       <li>CommandLine.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_BUILDING_INDEX() {
        return inter("CMD_BUILDING_INDEX", "Building index");
    }

    /**
    <table border="1"><tr><td>
    <pre>Disc read error.</pre>
    </td></tr></table>
    <ul>
       <li>CommandLine.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_DISC_READ_ERROR() {
        return inter("CMD_DISC_READ_ERROR", "Disc read error.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Invalid verbosity level {0}</pre>
    </td></tr></table>
    <ul>
       <li>CommandLine.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_VERBOSE_LVL_INVALID_STR(@Nonnull String badVerbosityLevel) {
        return inter("CMD_VERBOSE_LVL_INVALID_STR", "Invalid verbosity level {0}", badVerbosityLevel);
    }

    /**
    <table border="1"><tr><td>
    <pre>Invalid verbosity level {0,number,#}</pre>
    </td></tr></table>
    <ul>
       <li>CommandLine.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_VERBOSE_LVL_INVALID_NUM(int badVerbosityNumber) {
        return inter("CMD_VERBOSE_LVL_INVALID_NUM", "Invalid verbosity level {0,number,#}", badVerbosityNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Saving index as {0}</pre>
    </td></tr></table>
    <ul>
       <li>CommandLine.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_SAVING_INDEX(@Nonnull String fileName) {
        return inter("CMD_SAVING_INDEX", "Saving index as {0}", fileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Try -? for help.</pre>
    </td></tr></table>
    <ul>
       <li>CommandLine.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_TRY_HELP() {
        return inter("CMD_TRY_HELP", "Try -? for help.");
    }

    /**
    <table border="1"><tr><td>
    <pre>No items found, not saving index file</pre>
    </td></tr></table>
    <ul>
       <li>CommandLine.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_NOT_SAVING_EMPTY_INDEX() {
        return inter("CMD_NOT_SAVING_EMPTY_INDEX", "No items found, not saving index file");
    }

    /**
    <table border="1"><tr><td>
    <pre>ERROR: {0} ({1})</pre>
    </td></tr></table>
    <ul>
       <li>CommandLine.java</li>
       <li>Command_Items.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_ERR_EX_CLASS(@Nonnull java.lang.Throwable errorMessage, @Nonnull String exceptionType) {
        return inter("CMD_ERR_EX_CLASS", "ERROR: {0} ({1})", errorMessage, exceptionType);
    }

    /**
    <table border="1"><tr><td>
    <pre>Need a main command.</pre>
    </td></tr></table>
    <ul>
       <li>CommandLine.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_NEED_MAIN_COMMAND() {
        return inter("CMD_NEED_MAIN_COMMAND", "Need a main command.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Identified as {0}</pre>
    </td></tr></table>
    <p>See DISC_FMT_*</p>
    <ul>
       <li>CommandLine.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_DISC_IDENTIFIED(@Nonnull ILocalizedMessage discFormatDescription) {
        return inter("CMD_DISC_IDENTIFIED", "Identified as {0}", discFormatDescription);
    }

    /**
    <table border="1"><tr><td>
    <pre>Command needs disc file</pre>
    </td></tr></table>
    <ul>
       <li>CommandLine.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_COMMAND_NEEDS_DISC() {
        return inter("CMD_COMMAND_NEEDS_DISC", "Command needs disc file");
    }

    /**
    <table border="1"><tr><td>
    <pre>Too many main commands.</pre>
    </td></tr></table>
    <ul>
       <li>CommandLine.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_TOO_MANY_MAIN_COMMANDS() {
        return inter("CMD_TOO_MANY_MAIN_COMMANDS", "Too many main commands.");
    }

    /**
    <table border="1"><tr><td>
    <pre>File not found {0}</pre>
    </td></tr></table>
    <ul>
       <li>CommandLine.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_FILE_NOT_FOUND_FILE(@Nonnull java.io.File fileName) {
        return inter("CMD_FILE_NOT_FOUND_FILE", "File not found {0}", fileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>jPSXdec: PSX media decoder (non-commercial) v{0}</pre>
    </td></tr></table>
    <ul>
       <li>CommandLine.java</li>
       <li>Gui.java</li>
       <li>GuiSettings.java</li>
       <li>Mdec2Jpeg.java</li>
       <li>AviWriter.java</li>
       <li>DebugFormatter.java</li>
       <li>UserFriendlyLogger.java</li>
    </ul>
    */
    public static ILocalizedMessage JPSXDEC_VERSION_NON_COMMERCIAL(@Nonnull String versionNumber) {
        return inter("JPSXDEC_VERSION_NON_COMMERCIAL", "jPSXdec: PSX media decoder (non-commercial) v{0}", versionNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Indexing {0}</pre>
    </td></tr></table>
    <ul>
       <li>CommandLine.java</li>
       <li>IndexingGui.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_GUI_INDEXING(@Nonnull jpsxdec.cdreaders.CdFileSectorReader cdIdentifier) {
        return inter("CMD_GUI_INDEXING", "Indexing {0}", cdIdentifier);
    }

    /**
    <table border="1"><tr><td>
    <pre>[{0}] {1,number,#%}{2,choice,0#|1# '{2,number,#}' '{2,choice,0#warnings|1#warning|1&lt;warnings}'}{3,choice,0#|1# '{3,number,#}' '{3,choice,0#errors|1#error|1&lt;errors}'}</pre>
    </td></tr></table>
    <p>Note the single quotes are necessary inside the choice argument.</p>
    <ul>
       <li>ConsoleProgressLogger.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_PROGRESS(@Nonnull String progressBar, double percentComplete, int warningCount, int errorCount) {
        return inter("CMD_PROGRESS", "[{0}] {1,number,#%}{2,choice,0#|1# '{2,number,#}' '{2,choice,0#warnings|1#warning|1<warnings}'}{3,choice,0#|1# '{3,number,#}' '{3,choice,0#errors|1#error|1<errors}'}", progressBar, percentComplete, warningCount, errorCount);
    }

    /**
    <table border="1"><tr><td>
    <pre>[{0}] {1,number,#%} {2} {3,choice,0#|1# '{3,number,#}' '{3,choice,0#warnings|1#warning|1&lt;warnings}'}{4,choice,0#|1# '{4,number,#}' '{4,choice,0#errors|1#error|1&lt;errors}'}</pre>
    </td></tr></table>
    <p>Note the single quotes are necessary inside the choice argument.</p>
    <ul>
       <li>ConsoleProgressLogger.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_PROGRESS_WITH_MSG(@Nonnull String progressBar, double percentComplete, @Nonnull ILocalizedMessage message, int warningCount, int errorCount) {
        return inter("CMD_PROGRESS_WITH_MSG", "[{0}] {1,number,#%} {2} {3,choice,0#|1# '{3,number,#}' '{3,choice,0#warnings|1#warning|1<warnings}'}{4,choice,0#|1# '{4,number,#}' '{4,choice,0#errors|1#error|1<errors}'}", progressBar, percentComplete, message, warningCount, errorCount);
    }

    /**
    <table border="1"><tr><td>
    <pre>Inconsistent width {0,number,#} != {1,number,#}</pre>
    </td></tr></table>
    */
    public static ILocalizedMessage INCONSISTENT_WIDTH(int currentWidth, int newWidth) {
        return inter("INCONSISTENT_WIDTH", "Inconsistent width {0,number,#} != {1,number,#}", currentWidth, newWidth);
    }

    /**
    <table border="1"><tr><td>
    <pre>Inconsistent height {0,number,#} != {1,number,#}</pre>
    </td></tr></table>
    */
    public static ILocalizedMessage INCONSISTENT_HEIGHT(int currentHeight, int newHeight) {
        return inter("INCONSISTENT_HEIGHT", "Inconsistent height {0,number,#} != {1,number,#}", currentHeight, newHeight);
    }

    /**
    <table border="1"><tr><td>
    <pre>Embedded Crusader audio {0,number,#}Hz</pre>
    </td></tr></table>
    <ul>
       <li>CrusaderDemuxer.java</li>
    </ul>
    */
    public static ILocalizedMessage EMBEDDED_CRUSADER_AUDIO_HZ(int audioSampleRate) {
        return inter("EMBEDDED_CRUSADER_AUDIO_HZ", "Embedded Crusader audio {0,number,#}Hz", audioSampleRate);
    }

    /**
    <table border="1"><tr><td>
    <pre>Crusader: No Remorse video is corrupted</pre>
    </td></tr></table>
    <p>&quot;Crusader: No Remorse&quot; is the name of a game</p>
    <ul>
       <li>CrusaderDemuxer.java</li>
    </ul>
    */
    public static ILocalizedMessage CRUSADER_VIDEO_CORRUPTED() {
        return inter("CRUSADER_VIDEO_CORRUPTED", "Crusader: No Remorse video is corrupted");
    }

    /**
    <table border="1"><tr><td>
    <pre>Crusader: No Remorse audio is corrupted</pre>
    </td></tr></table>
    <p>&quot;Crusader: No Remorse&quot; is the name of a game</p>
    <ul>
       <li>CrusaderDemuxer.java</li>
    </ul>
    */
    public static ILocalizedMessage CRUSADER_AUDIO_CORRUPTED() {
        return inter("CRUSADER_AUDIO_CORRUPTED", "Crusader: No Remorse audio is corrupted");
    }

    /**
    <table border="1"><tr><td>
    <pre>Frame {0} chunk {1,number,#} missing.</pre>
    </td></tr></table>
    <ul>
       <li>DemuxedCrusaderFrame.java</li>
    </ul>
    */
    public static ILocalizedMessage MISSING_CHUNK(@Nonnull jpsxdec.discitems.FrameNumber frameNumber, int chunkNumber) {
        return inter("MISSING_CHUNK", "Frame {0} chunk {1,number,#} missing.", frameNumber, chunkNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Empty serialized string</pre>
    </td></tr></table>
    <ul>
       <li>SerializedDiscItem.java</li>
    </ul>
    */
    public static ILocalizedMessage EMPTY_SERIALIZED_STRING() {
        return inter("EMPTY_SERIALIZED_STRING", "Empty serialized string");
    }

    /**
    <table border="1"><tr><td>
    <pre>Failed to convert serialized field to int: {0}</pre>
    </td></tr></table>
    <p>TODO combine with next one</p>
    <ul>
       <li>SerializedDiscItem.java</li>
    </ul>
    */
    public static ILocalizedMessage SERIALIZATION_FAILED_TO_CONVERT_TO_INT(@Nonnull String badNumber) {
        return inter("SERIALIZATION_FAILED_TO_CONVERT_TO_INT", "Failed to convert serialized field to int: {0}", badNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Failed to convert serialized field to long: {0}</pre>
    </td></tr></table>
    <ul>
       <li>SerializedDiscItem.java</li>
    </ul>
    */
    public static ILocalizedMessage SERIALIZATION_FAILED_TO_CONVERT_TO_LONG(@Nonnull String badNumber) {
        return inter("SERIALIZATION_FAILED_TO_CONVERT_TO_LONG", "Failed to convert serialized field to long: {0}", badNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Improperly formatted field serialization: {0}</pre>
    </td></tr></table>
    <ul>
       <li>SerializedDiscItem.java</li>
    </ul>
    */
    public static ILocalizedMessage SERIALIZATION_FIELD_IMPROPERLY_FORMATTED(@Nonnull String lineFromIndexFile) {
        return inter("SERIALIZATION_FIELD_IMPROPERLY_FORMATTED", "Improperly formatted field serialization: {0}", lineFromIndexFile);
    }

    /**
    <table border="1"><tr><td>
    <pre>Failed to convert serialized value to range: {0}</pre>
    </td></tr></table>
    <ul>
       <li>SerializedDiscItem.java</li>
    </ul>
    */
    public static ILocalizedMessage SERIALIZATION_FAILED_TO_CONVERT_TO_RANGE(@Nonnull String badRange) {
        return inter("SERIALIZATION_FAILED_TO_CONVERT_TO_RANGE", "Failed to convert serialized value to range: {0}", badRange);
    }

    /**
    <table border="1"><tr><td>
    <pre>Line missing vital fields {0}</pre>
    </td></tr></table>
    <ul>
       <li>SerializedDiscItem.java</li>
    </ul>
    */
    public static ILocalizedMessage SERIALIZATION_MISSING_REQUIRED_FIELDS(@Nonnull String lineFromIndexFile) {
        return inter("SERIALIZATION_MISSING_REQUIRED_FIELDS", "Line missing vital fields {0}", lineFromIndexFile);
    }

    /**
    <table border="1"><tr><td>
    <pre>{0} field not found.</pre>
    </td></tr></table>
    <ul>
       <li>SerializedDiscItem.java</li>
    </ul>
    */
    public static ILocalizedMessage SERIALIZATION_FIELD_NOT_FOUND(@Nonnull String missingField) {
        return inter("SERIALIZATION_FIELD_NOT_FOUND", "{0} field not found.", missingField);
    }

    /**
    <table border="1"><tr><td>
    <pre>Disc format does not match what index says &quot;{0}&quot; != &quot;{1}&quot;.</pre>
    </td></tr></table>
    <ul>
       <li>DiscIndex.java</li>
    </ul>
    */
    public static ILocalizedMessage CD_FORMAT_MISMATCH(@Nonnull jpsxdec.cdreaders.CdFileSectorReader actualFormatDescription, @Nonnull String indexFormatDescription) {
        return inter("CD_FORMAT_MISMATCH", "Disc format does not match what index says \"{0}\" != \"{1}\".", actualFormatDescription, indexFormatDescription);
    }

    /**
    <table border="1"><tr><td>
    <pre>Missing proper index header.</pre>
    </td></tr></table>
    <ul>
       <li>DiscIndex.java</li>
    </ul>
    */
    public static ILocalizedMessage INDEX_HEADER_MISSING() {
        return inter("INDEX_HEADER_MISSING", "Missing proper index header.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Error while indexing disc</pre>
    </td></tr></table>
    <ul>
       <li>DiscIndex.java</li>
    </ul>
    */
    public static ILocalizedMessage INDEXING_ERROR() {
        return inter("INDEXING_ERROR", "Error while indexing disc");
    }

    /**
    <table border="1"><tr><td>
    <pre>Detected corruption in sector {0,number,#}. This may affect identification and conversion.</pre>
    </td></tr></table>
    <ul>
       <li>DiscIndex.java</li>
    </ul>
    */
    public static ILocalizedMessage INDEX_SECTOR_CORRUPTED(int sectorNumber) {
        return inter("INDEX_SECTOR_CORRUPTED", "Detected corruption in sector {0,number,#}. This may affect identification and conversion.", sectorNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Non-continuous sector header number: {0,number,#} -&gt; {1,number,#}</pre>
    </td></tr></table>
    <ul>
       <li>DiscIndex.java</li>
    </ul>
    */
    public static ILocalizedMessage INDEX_SECTOR_HEADER_NUM_BREAK(int previousSectorNumber, int currentSectorNumber) {
        return inter("INDEX_SECTOR_HEADER_NUM_BREAK", "Non-continuous sector header number: {0,number,#} -> {1,number,#}", previousSectorNumber, currentSectorNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Sector {0,number,#} is Mode 1 found among Mode 2 sectors</pre>
    </td></tr></table>
    <ul>
       <li>DiscIndex.java</li>
    </ul>
    */
    public static ILocalizedMessage INDEX_MODE1_AMONG_MODE2(int sectorNumber) {
        return inter("INDEX_MODE1_AMONG_MODE2", "Sector {0,number,#} is Mode 1 found among Mode 2 sectors", sectorNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Failed to parse line: {0}</pre>
    </td></tr></table>
    <ul>
       <li>DiscIndex.java</li>
    </ul>
    */
    public static ILocalizedMessage INDEX_PARSE_LINE_FAIL(@Nonnull String lineFromIndexFile) {
        return inter("INDEX_PARSE_LINE_FAIL", "Failed to parse line: {0}", lineFromIndexFile);
    }

    /**
    <table border="1"><tr><td>
    <pre>Failed to do anything with {0}</pre>
    </td></tr></table>
    <ul>
       <li>DiscIndex.java</li>
    </ul>
    */
    public static ILocalizedMessage INDEX_UNHANDLED_LINE(@Nonnull String lineFromIndexFile) {
        return inter("INDEX_UNHANDLED_LINE", "Failed to do anything with {0}", lineFromIndexFile);
    }

    /**
    <table border="1"><tr><td>
    <pre>Sector {0,number,#} / {1,number,#} {2,number,#} items found</pre>
    </td></tr></table>
    <ul>
       <li>DiscIndex.java</li>
    </ul>
    */
    public static ILocalizedMessage INDEX_SECTOR_ITEM_PROGRESS(int currentSectorNumber, int totalSectorCount, int itemsFound) {
        return inter("INDEX_SECTOR_ITEM_PROGRESS", "Sector {0,number,#} / {1,number,#} {2,number,#} items found", currentSectorNumber, totalSectorCount, itemsFound);
    }

    /**
    <table border="1"><tr><td>
    <pre>{0} Lines that begin with {0} are ignored</pre>
    </td></tr></table>
    <ul>
       <li>DiscIndex.java</li>
    </ul>
    */
    public static ILocalizedMessage INDEX_COMMENT(@Nonnull String lineCommentCharacter) {
        return inter("INDEX_COMMENT", "{0} Lines that begin with {0} are ignored", lineCommentCharacter);
    }

    /**
    <table border="1"><tr><td>
    <pre>{0} rejected {1}</pre>
    </td></tr></table>
    <ul>
       <li>DiscIndex.java</li>
    </ul>
    */
    public static ILocalizedMessage INDEX_REBUILD_PARENT_REJECTED_CHILD(@Nonnull jpsxdec.discitems.DiscItem baseDiscItem, @Nonnull jpsxdec.discitems.DiscItem childDiscItem) {
        return inter("INDEX_REBUILD_PARENT_REJECTED_CHILD", "{0} rejected {1}", baseDiscItem, childDiscItem);
    }

    /**
    <table border="1"><tr><td>
    <pre>Index is missing source CD file and no source file was supplied.</pre>
    </td></tr></table>
    <ul>
       <li>DiscIndex.java</li>
    </ul>
    */
    public static ILocalizedMessage INDEX_NO_CD() {
        return inter("INDEX_NO_CD", "Index is missing source CD file and no source file was supplied.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Ignoring a silent XA audio stream that is only 1 sector long at sector {0,number,#}, channel {1,number,#}</pre>
    </td></tr></table>
    <ul>
       <li>DiscIndexerXaAudio.java</li>
    </ul>
    */
    public static ILocalizedMessage IGNORING_SILENT_XA_SECTOR(int sectorNumber, int channelNumber) {
        return inter("IGNORING_SILENT_XA_SECTOR", "Ignoring a silent XA audio stream that is only 1 sector long at sector {0,number,#}, channel {1,number,#}", sectorNumber, channelNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Video</pre>
    </td></tr></table>
    <ul>
       <li>DiscItem.java</li>
    </ul>
    */
    public static ILocalizedMessage ITEM_TYPE_VIDEO() {
        return inter("ITEM_TYPE_VIDEO", "Video");
    }

    /**
    <table border="1"><tr><td>
    <pre>Video</pre>
    </td></tr></table>
    <p>Variation for &quot;Apply to all Video&quot;</p>
    <ul>
       <li>DiscItem.java</li>
    </ul>
    */
    public static ILocalizedMessage ITEM_TYPE_VIDEO_APPLY() {
        return inter("ITEM_TYPE_VIDEO_APPLY", "Video");
    }

    /**
    <table border="1"><tr><td>
    <pre>File</pre>
    </td></tr></table>
    <ul>
       <li>DiscItem.java</li>
    </ul>
    */
    public static ILocalizedMessage ITEM_TYPE_FILE() {
        return inter("ITEM_TYPE_FILE", "File");
    }

    /**
    <table border="1"><tr><td>
    <pre>File</pre>
    </td></tr></table>
    <p>Variation for &quot;Apply to all File&quot;</p>
    <ul>
       <li>DiscItem.java</li>
    </ul>
    */
    public static ILocalizedMessage ITEM_TYPE_FILE_APPLY() {
        return inter("ITEM_TYPE_FILE_APPLY", "File");
    }

    /**
    <table border="1"><tr><td>
    <pre>Audio</pre>
    </td></tr></table>
    <ul>
       <li>DiscItem.java</li>
    </ul>
    */
    public static ILocalizedMessage ITEM_TYPE_AUDIO() {
        return inter("ITEM_TYPE_AUDIO", "Audio");
    }

    /**
    <table border="1"><tr><td>
    <pre>Audio</pre>
    </td></tr></table>
    <p>Variation for &quot;Apply to all Audio&quot;</p>
    <ul>
       <li>DiscItem.java</li>
    </ul>
    */
    public static ILocalizedMessage ITEM_TYPE_AUDIO_APPLY() {
        return inter("ITEM_TYPE_AUDIO_APPLY", "Audio");
    }

    /**
    <table border="1"><tr><td>
    <pre>Image</pre>
    </td></tr></table>
    <ul>
       <li>DiscItem.java</li>
    </ul>
    */
    public static ILocalizedMessage ITEM_TYPE_IMAGE() {
        return inter("ITEM_TYPE_IMAGE", "Image");
    }

    /**
    <table border="1"><tr><td>
    <pre>Image</pre>
    </td></tr></table>
    <p>Variation for &quot;Apply to all Image&quot;</p>
    <ul>
       <li>DiscItem.java</li>
    </ul>
    */
    public static ILocalizedMessage ITEM_TYPE_IMAGE_APPLY() {
        return inter("ITEM_TYPE_IMAGE_APPLY", "Image");
    }

    /**
    <table border="1"><tr><td>
    <pre>{0,number,#}x{1,number,#}, {2,number,#} frames, {3,number,#} fps = {4,time,m:ss}</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemCrusader.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_CRUSADER_VID_DETAILS(int videoWidth, int videoHeight, int frameCount, int framesPerSecond, @Nonnull java.util.Date duration) {
        return inter("GUI_CRUSADER_VID_DETAILS", "{0,number,#}x{1,number,#}, {2,number,#} frames, {3,number,#} fps = {4,time,m:ss}", videoWidth, videoHeight, frameCount, framesPerSecond, duration);
    }

    /**
    <table border="1"><tr><td>
    <pre>{0} bytes</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemISO9660File.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_ISOFILE_DETAILS(long fileSize) {
        return inter("GUI_ISOFILE_DETAILS", "{0} bytes", fileSize);
    }

    /**
    <table border="1"><tr><td>
    <pre>-iso  save as ISO style 2048 bytes/sector (default is raw {0,number,#} bytes/sector)</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemISO9660File.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_ISOFILE_ISO_HELP(int rawBytesPerSector) {
        return inter("CMD_ISOFILE_ISO_HELP", "-iso  save as ISO style 2048 bytes/sector (default is raw {0,number,#} bytes/sector)", rawBytesPerSector);
    }

    /**
    <table border="1"><tr><td>
    <pre>Save raw:</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemISO9660File.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_ISOFILE_SAVE_RAW_LABEL() {
        return inter("GUI_ISOFILE_SAVE_RAW_LABEL", "Save raw:");
    }

    /**
    <table border="1"><tr><td>
    <pre>[no options available]</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemISO9660File.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_ISOFILE_HELP_NO_OPTIONS() {
        return inter("CMD_ISOFILE_HELP_NO_OPTIONS", "[no options available]");
    }

    /**
    <table border="1"><tr><td>
    <pre>Saving with raw sectors</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemISO9660File.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_ISOFILE_SAVING_RAW() {
        return inter("CMD_ISOFILE_SAVING_RAW", "Saving with raw sectors");
    }

    /**
    <table border="1"><tr><td>
    <pre>Saving with iso sectors</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemISO9660File.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_ISOFILE_SAVING_ISO() {
        return inter("CMD_ISOFILE_SAVING_ISO", "Saving with iso sectors");
    }

    /**
    <table border="1"><tr><td>
    <pre>Save as:</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemISO9660File.java</li>
       <li>AudioSaverBuilderGui.java</li>
       <li>SpuSaverBuilderGui.java</li>
       <li>TimSaverBuilderGui.java</li>
       <li>VideoSaverPanel.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SAVE_AS_LABEL() {
        return inter("GUI_SAVE_AS_LABEL", "Save as:");
    }

    /**
    <table border="1"><tr><td>
    <pre>{0,time,m:ss}, {1,number,#} Hz Stereo</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemSquareAudioStream.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SQUARE_AUDIO_DETAILS(@Nonnull java.util.Date duration, int sampleRate) {
        return inter("GUI_SQUARE_AUDIO_DETAILS", "{0,time,m:ss}, {1,number,#} Hz Stereo", duration, sampleRate);
    }

    /**
    <table border="1"><tr><td>
    <pre>{0,number,#}x{1,number,#}, {2,number,#} frames, {3,number,#.###} fps = {4,time,m:ss} (or {5,number,#.###} fps = {6,time,m:ss})</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemStrVideoStream.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_STR_VIDEO_DETAILS_UNKNOWN_FPS(int videoWidth, int videoHeight, int frameCount, double doubleSpeedFramesPerSecond, @Nonnull java.util.Date doubleSpeedDuration, double singleSpeedFramesPerSecond, @Nonnull java.util.Date singleSpeedDuration) {
        return inter("GUI_STR_VIDEO_DETAILS_UNKNOWN_FPS", "{0,number,#}x{1,number,#}, {2,number,#} frames, {3,number,#.###} fps = {4,time,m:ss} (or {5,number,#.###} fps = {6,time,m:ss})", videoWidth, videoHeight, frameCount, doubleSpeedFramesPerSecond, doubleSpeedDuration, singleSpeedFramesPerSecond, singleSpeedDuration);
    }

    /**
    <table border="1"><tr><td>
    <pre>{0,number,#}x{1,number,#}, {2,number,#} frames, {3,number,#.###} fps = {4,time,m:ss}</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemStrVideoStream.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_STR_VIDEO_DETAILS(int videoWidth, int videoHeight, int frameCount, double framesPerSecond, @Nonnull java.util.Date duration) {
        return inter("GUI_STR_VIDEO_DETAILS", "{0,number,#}x{1,number,#}, {2,number,#} frames, {3,number,#.###} fps = {4,time,m:ss}", videoWidth, videoHeight, frameCount, framesPerSecond, duration);
    }

    /**
    <table border="1"><tr><td>
    <pre>Writing {0,number,#} bytes to sector {1,number,#}</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemTim.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_TIM_REPLACE_SECTOR_BYTES(int byteCount, int sectorNumber) {
        return inter("CMD_TIM_REPLACE_SECTOR_BYTES", "Writing {0,number,#} bytes to sector {1,number,#}", byteCount, sectorNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>{0,number,#}x{1,number,#}, Palettes: {2,number,#}</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemTim.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_TIM_IMAGE_DETAILS(int timWidth, int timHeight, int paletteCount) {
        return inter("GUI_TIM_IMAGE_DETAILS", "{0,number,#}x{1,number,#}, Palettes: {2,number,#}", timWidth, timHeight, paletteCount);
    }

    /**
    <table border="1"><tr><td>
    <pre>New TIM dimensions ({0,number,#}x{1,number,#}) do not match existing TIM dimensions ({2,number,#}x{3,number,#}).</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemTim.java</li>
    </ul>
    */
    public static ILocalizedMessage TIM_REPLACE_DIMENSIONS_MISMATCH(int sourceWidth, int sourceHeight, int replaceWidth, int replaceHeight) {
        return inter("TIM_REPLACE_DIMENSIONS_MISMATCH", "New TIM dimensions ({0,number,#}x{1,number,#}) do not match existing TIM dimensions ({2,number,#}x{3,number,#}).", sourceWidth, sourceHeight, replaceWidth, replaceHeight);
    }

    /**
    <table border="1"><tr><td>
    <pre>Unable to replace a multi-paletted TIM with a simple image</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemTim.java</li>
    </ul>
    */
    public static ILocalizedMessage TIM_REPLACE_MULTI_CLUT_UNABLE() {
        return inter("TIM_REPLACE_MULTI_CLUT_UNABLE", "Unable to replace a multi-paletted TIM with a simple image");
    }

    /**
    <table border="1"><tr><td>
    <pre>Patching sector {0}</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemXaAudioStream.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_PATCHING_SECTOR_DESCRIPTION(@Nonnull String sectorDescription) {
        return inter("CMD_PATCHING_SECTOR_DESCRIPTION", "Patching sector {0}", sectorDescription);
    }

    /**
    <table border="1"><tr><td>
    <pre>Patching sector {0,number,#}</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemXaAudioStream.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_PATCHING_SECTOR_NUMBER(int sectorNumber) {
        return inter("CMD_PATCHING_SECTOR_NUMBER", "Patching sector {0,number,#}", sectorNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>with sector {0}</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemXaAudioStream.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_PATCHING_WITH_SECTOR_DESCRIPTION(@Nonnull String otherSectorDescription) {
        return inter("CMD_PATCHING_WITH_SECTOR_DESCRIPTION", "with sector {0}", otherSectorDescription);
    }

    /**
    <table border="1"><tr><td>
    <pre>{0} field has invalid value: {1,number,#}</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemXaAudioStream.java</li>
    </ul>
    */
    public static ILocalizedMessage FIELD_HAS_INVALID_VALUE_NUM(@Nonnull String fieldName, int badFieldNumberValue) {
        return inter("FIELD_HAS_INVALID_VALUE_NUM", "{0} field has invalid value: {1,number,#}", fieldName, badFieldNumberValue);
    }

    /**
    <table border="1"><tr><td>
    <pre>{0} field has invalid value: {1}</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemXaAudioStream.java</li>
       <li>SerializedDiscItem.java</li>
    </ul>
    */
    public static ILocalizedMessage FIELD_HAS_INVALID_VALUE_STR(@Nonnull String fieldName, @Nonnull String badFieldStringValue) {
        return inter("FIELD_HAS_INVALID_VALUE_STR", "{0} field has invalid value: {1}", fieldName, badFieldStringValue);
    }

    /**
    <table border="1"><tr><td>
    <pre>XA audio corrupted at sector {0,number,#} affecting samples after {1,number,#}</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemXaAudioStream.java</li>
    </ul>
    */
    public static ILocalizedMessage XA_AUDIO_CORRUPTED(int sectorNumber, long firstBadSample) {
        return inter("XA_AUDIO_CORRUPTED", "XA audio corrupted at sector {0,number,#} affecting samples after {1,number,#}", sectorNumber, firstBadSample);
    }

    /**
    <table border="1"><tr><td>
    <pre>Audio corrupted near sector {0,number,#} affecting samples after {1,number,#}</pre>
    </td></tr></table>
    <ul>
       <li>CrusaderDemuxer.java</li>
       <li>DiscItemSquareAudioStream.java</li>
    </ul>
    */
    public static ILocalizedMessage SPU_ADPCM_CORRUPTED(int approximateSectorNumber, long firstBadSample) {
        return inter("SPU_ADPCM_CORRUPTED", "Audio corrupted near sector {0,number,#} affecting samples after {1,number,#}", approximateSectorNumber, firstBadSample);
    }

    /**
    <table border="1"><tr><td>
    <pre>{0,time,m:ss}, {1,number,#} Hz {2,choice,1#Mono|2#Stereo}</pre>
    </td></tr></table>
    <p>Channel count is 1=Mono, 2=Stereo</p>
    <ul>
       <li>DiscItemXaAudioStream.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_XA_DESCRIPTION(@Nonnull java.util.Date duration, int audioSampleRate, int audioChannelCount) {
        return inter("GUI_XA_DESCRIPTION", "{0,time,m:ss}, {1,number,#} Hz {2,choice,1#Mono|2#Stereo}", duration, audioSampleRate, audioChannelCount);
    }

    /**
    <table border="1"><tr><td>
    <pre>Patching {0}</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemXaAudioStream.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_PATCHING_DISC_ITEM(@Nonnull String discItemDescription) {
        return inter("CMD_PATCHING_DISC_ITEM", "Patching {0}", discItemDescription);
    }

    /**
    <table border="1"><tr><td>
    <pre>with {0}</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemXaAudioStream.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_PATCHING_WITH_DISC_ITEM(@Nonnull String otherDiscItemDescription) {
        return inter("CMD_PATCHING_WITH_DISC_ITEM", "with {0}", otherDiscItemDescription);
    }

    /**
    <table border="1"><tr><td>
    <pre>Audio file sample rate {0} does not match XA audio rate {1}</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemXaAudioStream.java</li>
    </ul>
    */
    public static ILocalizedMessage XA_COPY_REPLACE_SAMPLE_RATE_MISMATCH(float incompatibleAudioSampleRate, int xaAudioSampleRate) {
        return inter("XA_COPY_REPLACE_SAMPLE_RATE_MISMATCH", "Audio file sample rate {0} does not match XA audio rate {1}", incompatibleAudioSampleRate, xaAudioSampleRate);
    }

    /**
    <table border="1"><tr><td>
    <pre>Audio file is {0,choice,1#Mono|2#Stereo} and does not match XA audio {1,choice,1#Mono|2#Stereo}</pre>
    </td></tr></table>
    <p>1 = Mono, 2 = Stereo</p>
    <ul>
       <li>DiscItemXaAudioStream.java</li>
    </ul>
    */
    public static ILocalizedMessage XA_COPY_REPLACE_CHANNEL_MISMATCH(int replaceChannelCount, int sourceChannelCount) {
        return inter("XA_COPY_REPLACE_CHANNEL_MISMATCH", "Audio file is {0,choice,1#Mono|2#Stereo} and does not match XA audio {1,choice,1#Mono|2#Stereo}", replaceChannelCount, sourceChannelCount);
    }

    /**
    <table border="1"><tr><td>
    <pre>Formats not equal</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemXaAudioStream.java</li>
    </ul>
    */
    public static ILocalizedMessage XA_ENCODE_REPLACE_FORMAT_MISMATCH() {
        return inter("XA_ENCODE_REPLACE_FORMAT_MISMATCH", "Formats not equal");
    }

    /**
    <table border="1"><tr><td>
    <pre>Source audio is exhausted, writing silence</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemXaAudioStream.java</li>
    </ul>
    */
    public static ILocalizedMessage XA_ENCODE_REPLACE_SRC_AUDIO_EXHAUSTED() {
        return inter("XA_ENCODE_REPLACE_SRC_AUDIO_EXHAUSTED", "Source audio is exhausted, writing silence");
    }

    /**
    <table border="1"><tr><td>
    <pre>End of source XA, stopping</pre>
    </td></tr></table>
    <ul>
       <li>DiscItemXaAudioStream.java</li>
    </ul>
    */
    public static ILocalizedMessage XA_COPY_REPLACE_SRC_XA_EXHAUSTED() {
        return inter("XA_COPY_REPLACE_SRC_XA_EXHAUSTED", "End of source XA, stopping");
    }

    /**
    <table border="1"><tr><td>
    <pre>Invalid frame number {0}</pre>
    </td></tr></table>
    <ul>
       <li>FrameLookup.java</li>
       <li>FrameNumber.java</li>
    </ul>
    */
    public static ILocalizedMessage FRAME_NUM_INVALID(@Nonnull String badFrameNumberString) {
        return inter("FRAME_NUM_INVALID", "Invalid frame number {0}", badFrameNumberString);
    }

    /**
    <table border="1"><tr><td>
    <pre>Invalid frame range {0}</pre>
    </td></tr></table>
    <ul>
       <li>FrameNumber.java</li>
    </ul>
    */
    public static ILocalizedMessage FRAME_NUM_RANGE_INVALID(@Nonnull String badFrameRangeString) {
        return inter("FRAME_NUM_RANGE_INVALID", "Invalid frame range {0}", badFrameRangeString);
    }

    /**
    <table border="1"><tr><td>
    <pre>Index</pre>
    </td></tr></table>
    <ul>
       <li>FrameNumberFormat.java</li>
    </ul>
    */
    public static ILocalizedMessage FRAME_NUM_FMT_INDEX() {
        return inter("FRAME_NUM_FMT_INDEX", "Index");
    }

    /**
    <table border="1"><tr><td>
    <pre>Sector</pre>
    </td></tr></table>
    <ul>
       <li>FrameNumberFormat.java</li>
    </ul>
    */
    public static ILocalizedMessage FRAME_NUM_FMT_SECTOR() {
        return inter("FRAME_NUM_FMT_SECTOR", "Sector");
    }

    /**
    <table border="1"><tr><td>
    <pre>Header</pre>
    </td></tr></table>
    <ul>
       <li>FrameNumberFormat.java</li>
    </ul>
    */
    public static ILocalizedMessage FRAME_NUM_FMT_HEADER() {
        return inter("FRAME_NUM_FMT_HEADER", "Header");
    }

    /**
    <table border="1"><tr><td>
    <pre>Sector {0}</pre>
    </td></tr></table>
    <ul>
       <li>FrameNumberFormatter.java</li>
    </ul>
    */
    public static ILocalizedMessage FRAME_NUM_FMTR_SECTOR(@Nonnull String formattedSectorNumber) {
        return inter("FRAME_NUM_FMTR_SECTOR", "Sector {0}", formattedSectorNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Frame {0}</pre>
    </td></tr></table>
    <ul>
       <li>FrameNumberFormatter.java</li>
    </ul>
    */
    public static ILocalizedMessage FRAME_NUM_FMTR_FRAME(@Nonnull String formattedFrameNumber) {
        return inter("FRAME_NUM_FMTR_FRAME", "Frame {0}", formattedFrameNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Invalid frame number format {0}</pre>
    </td></tr></table>
    <ul>
       <li>FrameNumberFormat.java</li>
    </ul>
    */
    public static ILocalizedMessage FRAME_NUM_FMT_INVALID(@Nonnull String badFrameNumberFormat) {
        return inter("FRAME_NUM_FMT_INVALID", "Invalid frame number format {0}", badFrameNumberFormat);
    }

    /**
    <table border="1"><tr><td>
    <pre>Not expecting duplicate frame number {0}</pre>
    </td></tr></table>
    <ul>
       <li>FrameNumberFormatter.java</li>
    </ul>
    */
    public static ILocalizedMessage NOT_EXPECTING_DUP_FRM_NUM(@Nonnull jpsxdec.discitems.FrameNumber frameNumber) {
        return inter("NOT_EXPECTING_DUP_FRM_NUM", "Not expecting duplicate frame number {0}", frameNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Not expecting duplicate sector number for frame {0}</pre>
    </td></tr></table>
    <ul>
       <li>FrameNumberFormatter.java</li>
    </ul>
    */
    public static ILocalizedMessage NOT_EXPECTING_DUP_SECT_NUM(@Nonnull jpsxdec.discitems.FrameNumber frameNumber) {
        return inter("NOT_EXPECTING_DUP_SECT_NUM", "Not expecting duplicate sector number for frame {0}", frameNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>*Unsaved*</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_TITLE_UNSAVED_INDEX() {
        return inter("GUI_TITLE_UNSAVED_INDEX", "*Unsaved*");
    }

    /**
    <table border="1"><tr><td>
    <pre>Open and Analyze File</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_OPEN_ANALYZE_DISC_BTN() {
        return inter("GUI_OPEN_ANALYZE_DISC_BTN", "Open and Analyze File");
    }

    /**
    <table border="1"><tr><td>
    <pre>Disc image does not have raw headers -- audio may not be detected.</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_DISC_NO_RAW_HEADERS_WARNING() {
        return inter("GUI_DISC_NO_RAW_HEADERS_WARNING", "Disc image does not have raw headers -- audio may not be detected.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Select disc image or media file</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_OPEN_DISC_DIALOG_TITLE() {
        return inter("GUI_OPEN_DISC_DIALOG_TITLE", "Select disc image or media file");
    }

    /**
    <table border="1"><tr><td>
    <pre>Open Index</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_OPEN_INDEX_BTN() {
        return inter("GUI_OPEN_INDEX_BTN", "Open Index");
    }

    /**
    <table border="1"><tr><td>
    <pre>Load index</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_LOAD_INDEX_FILE_DIALOG_TITLE() {
        return inter("GUI_LOAD_INDEX_FILE_DIALOG_TITLE", "Load index");
    }

    /**
    <table border="1"><tr><td>
    <pre>Issues loading index</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_INDEX_LOAD_ISSUES_DIALOG_TITLE() {
        return inter("GUI_INDEX_LOAD_ISSUES_DIALOG_TITLE", "Issues loading index");
    }

    /**
    <table border="1"><tr><td>
    <pre>Loaded {0,number,#} items, but with issues.</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_INDEX_LOAD_ISSUES(int itemCount) {
        return inter("GUI_INDEX_LOAD_ISSUES", "Loaded {0,number,#} items, but with issues.", itemCount);
    }

    /**
    <table border="1"><tr><td>
    <pre>Warnings: {0,number,#}</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_INDEX_LOAD_ISSUES_WARNINGS(int warningCount) {
        return inter("GUI_INDEX_LOAD_ISSUES_WARNINGS", "Warnings: {0,number,#}", warningCount);
    }

    /**
    <table border="1"><tr><td>
    <pre>Errors: {0,number,#}</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_INDEX_LOAD_ISSUES_ERRORS(int errorCount) {
        return inter("GUI_INDEX_LOAD_ISSUES_ERRORS", "Errors: {0,number,#}", errorCount);
    }

    /**
    <table border="1"><tr><td>
    <pre>See {0} for details.</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_INDEX_LOAD_ISSUES_SEE_FILE(@Nonnull String logFileName) {
        return inter("GUI_INDEX_LOAD_ISSUES_SEE_FILE", "See {0} for details.", logFileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Save Index</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SAVE_INDEX_BTN() {
        return inter("GUI_SAVE_INDEX_BTN", "Save Index");
    }

    /**
    <table border="1"><tr><td>
    <pre>Save index</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SAVE_INDEX_FILE_DIALOG_TITLE() {
        return inter("GUI_SAVE_INDEX_FILE_DIALOG_TITLE", "Save index");
    }

    /**
    <table border="1"><tr><td>
    <pre>Error saving index</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SAVE_INDEX_ERR() {
        return inter("GUI_SAVE_INDEX_ERR", "Error saving index");
    }

    /**
    <table border="1"><tr><td>
    <pre>Directory:</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_DIRECTORY_LABEL() {
        return inter("GUI_DIRECTORY_LABEL", "Directory:");
    }

    /**
    <table border="1"><tr><td>
    <pre>...</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_DIR_CHOOSER_BTN() {
        return inter("GUI_DIR_CHOOSER_BTN", "...");
    }

    /**
    <table border="1"><tr><td>
    <pre>Select ...</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SELECT_BTN() {
        return inter("GUI_SELECT_BTN", "Select ...");
    }

    /**
    <table border="1"><tr><td>
    <pre>Collapse All</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_COLLAPSE_ALL_BTN() {
        return inter("GUI_COLLAPSE_ALL_BTN", "Collapse All");
    }

    /**
    <table border="1"><tr><td>
    <pre>Expand All</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_EXPAND_ALL_BTN() {
        return inter("GUI_EXPAND_ALL_BTN", "Expand All");
    }

    /**
    <table border="1"><tr><td>
    <pre>Save All Selected</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SAVE_ALL_SELECTED_BTN() {
        return inter("GUI_SAVE_ALL_SELECTED_BTN", "Save All Selected");
    }

    /**
    <table border="1"><tr><td>
    <pre>Nothing is marked for saving.</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_NOTHING_IS_MARKED_FOR_SAVING() {
        return inter("GUI_NOTHING_IS_MARKED_FOR_SAVING", "Nothing is marked for saving.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Apply to all {0}</pre>
    </td></tr></table>
    <p>See ITEM_TYPE_*_APPLY</p>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_APPLY_TO_ALL_BTN(@Nonnull ILocalizedMessage itemTypeName) {
        return inter("GUI_APPLY_TO_ALL_BTN", "Apply to all {0}", itemTypeName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Applied settings to {0,number,#} items.</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_APPLIED_SETTINGS(int itemCount) {
        return inter("GUI_APPLIED_SETTINGS", "Applied settings to {0,number,#} items.", itemCount);
    }

    /**
    <table border="1"><tr><td>
    <pre>The index has not been saved. Save index?</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SAVE_INDEX_PROMPT() {
        return inter("GUI_SAVE_INDEX_PROMPT", "The index has not been saved. Save index?");
    }

    /**
    <table border="1"><tr><td>
    <pre>Save index?</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SAVE_INDEX_PROMPT_TITLE() {
        return inter("GUI_SAVE_INDEX_PROMPT_TITLE", "Save index?");
    }

    /**
    <table border="1"><tr><td>
    <pre>    Play    </pre>
    </td></tr></table>
    <p>Extra space to give the tab some width</p>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_PLAY_TAB() {
        return inter("GUI_PLAY_TAB", "    Play    ");
    }

    /**
    <table border="1"><tr><td>
    <pre>    Save    </pre>
    </td></tr></table>
    <p>Extra space to give the tab some width</p>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SAVE_TAB() {
        return inter("GUI_SAVE_TAB", "    Save    ");
    }

    /**
    <table border="1"><tr><td>
    <pre>Pause</pre>
    </td></tr></table>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_PAUSE_BTN() {
        return inter("GUI_PAUSE_BTN", "Pause");
    }

    /**
    <table border="1"><tr><td>
    <pre>Bad error</pre>
    </td></tr></table>
    <p>I may combine with GUI_UNHANDLED_ERROR at some point</p>
    <ul>
       <li>Gui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_BAD_ERROR() {
        return inter("GUI_BAD_ERROR", "Bad error");
    }

    /**
    <table border="1"><tr><td>
    <pre>CD images (*.iso, *.bin, *.img, *.mdf)</pre>
    </td></tr></table>
    <ul>
       <li>GuiFileFilters.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_CD_IMAGE_EXTENSIONS() {
        return inter("GUI_CD_IMAGE_EXTENSIONS", "CD images (*.iso, *.bin, *.img, *.mdf)");
    }

    /**
    <table border="1"><tr><td>
    <pre>Index files (*.idx)</pre>
    </td></tr></table>
    <ul>
       <li>GuiFileFilters.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_INDEX_EXTENSION() {
        return inter("GUI_INDEX_EXTENSION", "Index files (*.idx)");
    }

    /**
    <table border="1"><tr><td>
    <pre>PlayStation video (*.str, *.mov, *.iki, *.ik2)</pre>
    </td></tr></table>
    <ul>
       <li>GuiFileFilters.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_PSX_VIDEO_EXTENSIONS() {
        return inter("GUI_PSX_VIDEO_EXTENSIONS", "PlayStation video (*.str, *.mov, *.iki, *.ik2)");
    }

    /**
    <table border="1"><tr><td>
    <pre>All compatible types</pre>
    </td></tr></table>
    <ul>
       <li>GuiFileFilters.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_ALL_COMPATIBLE_EXTENSIONS() {
        return inter("GUI_ALL_COMPATIBLE_EXTENSIONS", "All compatible types");
    }

    /**
    <table border="1"><tr><td>
    <pre>PlayStation/CD-i audio (*.xa, *.xai)</pre>
    </td></tr></table>
    <ul>
       <li>GuiFileFilters.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_XA_EXTENSION() {
        return inter("GUI_XA_EXTENSION", "PlayStation/CD-i audio (*.xa, *.xai)");
    }

    /**
    <table border="1"><tr><td>
    <pre></pre>
    </td></tr></table>
    <p>Name column is blank in English</p>
    <ul>
       <li>GuiTree.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_TREE_NAME_COLUMN() {
        return inter("GUI_TREE_NAME_COLUMN", "");
    }

    /**
    <table border="1"><tr><td>
    <pre>Sectors</pre>
    </td></tr></table>
    <ul>
       <li>GuiTree.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SECTORS_COLUMN() {
        return inter("GUI_SECTORS_COLUMN", "Sectors");
    }

    /**
    <table border="1"><tr><td>
    <pre>Type</pre>
    </td></tr></table>
    <ul>
       <li>GuiTree.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_TREE_TYPE_COLUMN() {
        return inter("GUI_TREE_TYPE_COLUMN", "Type");
    }

    /**
    <table border="1"><tr><td>
    <pre>none</pre>
    </td></tr></table>
    <ul>
       <li>GuiTree.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SELECT_NONE() {
        return inter("GUI_SELECT_NONE", "none");
    }

    /**
    <table border="1"><tr><td>
    <pre>all Video</pre>
    </td></tr></table>
    <ul>
       <li>GuiTree.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SELECT_ALL_VIDEO() {
        return inter("GUI_SELECT_ALL_VIDEO", "all Video");
    }

    /**
    <table border="1"><tr><td>
    <pre>all Files</pre>
    </td></tr></table>
    <ul>
       <li>GuiTree.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SELECT_ALL_FILES() {
        return inter("GUI_SELECT_ALL_FILES", "all Files");
    }

    /**
    <table border="1"><tr><td>
    <pre>all Audio (excluding video audio)</pre>
    </td></tr></table>
    <ul>
       <li>GuiTree.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SELECT_ALL_AUIO_EX_VID() {
        return inter("GUI_SELECT_ALL_AUIO_EX_VID", "all Audio (excluding video audio)");
    }

    /**
    <table border="1"><tr><td>
    <pre>all Audio (including video audio)</pre>
    </td></tr></table>
    <ul>
       <li>GuiTree.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SELECT_ALL_AUDIO_INC_VID() {
        return inter("GUI_SELECT_ALL_AUDIO_INC_VID", "all Audio (including video audio)");
    }

    /**
    <table border="1"><tr><td>
    <pre>all Images</pre>
    </td></tr></table>
    <ul>
       <li>GuiTree.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SELECT_ALL_IMAGES() {
        return inter("GUI_SELECT_ALL_IMAGES", "all Images");
    }

    /**
    <table border="1"><tr><td>
    <pre>Unnamed</pre>
    </td></tr></table>
    <ul>
       <li>IndexId.java</li>
    </ul>
    */
    public static ILocalizedMessage UNNAMED_DISC_ITEM() {
        return inter("UNNAMED_DISC_ITEM", "Unnamed");
    }

    /**
    <table border="1"><tr><td>
    <pre>Invalid id format: {0}</pre>
    </td></tr></table>
    <ul>
       <li>IndexId.java</li>
    </ul>
    */
    public static ILocalizedMessage ID_FORMAT_INVALID(@Nonnull String badIndexId) {
        return inter("ID_FORMAT_INVALID", "Invalid id format: {0}", badIndexId);
    }

    /**
    <table border="1"><tr><td>
    <pre>Warnings:</pre>
    </td></tr></table>
    <ul>
       <li>IndexingGui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_INDEX_WARNINGS_LABEL() {
        return inter("GUI_INDEX_WARNINGS_LABEL", "Warnings:");
    }

    /**
    <table border="1"><tr><td>
    <pre>Failure - See {0} for details</pre>
    </td></tr></table>
    <ul>
       <li>IndexingGui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_INDEX_RESULT_FAILURE(@Nonnull String logFileName) {
        return inter("GUI_INDEX_RESULT_FAILURE", "Failure - See {0} for details", logFileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Canceled</pre>
    </td></tr></table>
    <ul>
       <li>IndexingGui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_INDEX_RESULT_CANCELED() {
        return inter("GUI_INDEX_RESULT_CANCELED", "Canceled");
    }

    /**
    <table border="1"><tr><td>
    <pre>Progress...</pre>
    </td></tr></table>
    <ul>
       <li>IndexingGui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_INDEX_TITLE() {
        return inter("GUI_INDEX_TITLE", "Progress...");
    }

    /**
    <table border="1"><tr><td>
    <pre>Exception</pre>
    </td></tr></table>
    <ul>
       <li>IndexingGui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_INDEX_EXCEPTION_DIALOG_TITLE() {
        return inter("GUI_INDEX_EXCEPTION_DIALOG_TITLE", "Exception");
    }

    /**
    <table border="1"><tr><td>
    <pre>Success with messages - See {0} for details</pre>
    </td></tr></table>
    <ul>
       <li>IndexingGui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_INDEX_RESULT_OK_MSGS(@Nonnull String logFileName) {
        return inter("GUI_INDEX_RESULT_OK_MSGS", "Success with messages - See {0} for details", logFileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Indexing:</pre>
    </td></tr></table>
    <ul>
       <li>IndexingGui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_INDEXING_LABEL() {
        return inter("GUI_INDEXING_LABEL", "Indexing:");
    }

    /**
    <table border="1"><tr><td>
    <pre>Errors:</pre>
    </td></tr></table>
    <ul>
       <li>IndexingGui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_INDEX_ERRORS_LABEL() {
        return inter("GUI_INDEX_ERRORS_LABEL", "Errors:");
    }

    /**
    <table border="1"><tr><td>
    <pre>Success!</pre>
    </td></tr></table>
    <ul>
       <li>IndexingGui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_INDEX_RESULT_SUCCESS() {
        return inter("GUI_INDEX_RESULT_SUCCESS", "Success!");
    }

    /**
    <table border="1"><tr><td>
    <pre>Cancel</pre>
    </td></tr></table>
    <ul>
       <li>IndexingGui.java</li>
       <li>SavingGui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_CANCEL_BTN() {
        return inter("GUI_CANCEL_BTN", "Cancel");
    }

    /**
    <table border="1"><tr><td>
    <pre>Close</pre>
    </td></tr></table>
    <ul>
       <li>IndexingGui.java</li>
       <li>SavingGui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_CLOSE_BTN() {
        return inter("GUI_CLOSE_BTN", "Close");
    }

    /**
    <table border="1"><tr><td>
    <pre>Start</pre>
    </td></tr></table>
    <ul>
       <li>IndexingGui.java</li>
       <li>SavingGui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_START_BTN() {
        return inter("GUI_START_BTN", "Start");
    }

    /**
    <table border="1"><tr><td>
    <pre>Unhandled error</pre>
    </td></tr></table>
    <ul>
       <li>IndexingGui.java</li>
       <li>SavingGuiTask.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_UNHANDLED_ERROR() {
        return inter("GUI_UNHANDLED_ERROR", "Unhandled error");
    }

    /**
    <table border="1"><tr><td>
    <pre>Directory {0} does not exist.</pre>
    </td></tr></table>
    */
    public static ILocalizedMessage DIR_DOES_NOT_EXIST(@Nonnull String directoryName) {
        return inter("DIR_DOES_NOT_EXIST", "Directory {0} does not exist.", directoryName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Cannot create directory over a file {0}</pre>
    </td></tr></table>
    <ul>
       <li>IO.java</li>
    </ul>
    */
    public static ILocalizedMessage CANNOT_CREATE_DIR_OVER_FILE(@Nonnull java.io.File existingFileName) {
        return inter("CANNOT_CREATE_DIR_OVER_FILE", "Cannot create directory over a file {0}", existingFileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Unable to create directory {0}</pre>
    </td></tr></table>
    <ul>
       <li>IO.java</li>
    </ul>
    */
    public static ILocalizedMessage UNABLE_TO_CREATE_DIR(@Nonnull java.io.File directoryName) {
        return inter("UNABLE_TO_CREATE_DIR", "Unable to create directory {0}", directoryName);
    }

    /**
    <table border="1"><tr><td>
    <pre>High quality (slower)</pre>
    </td></tr></table>
    <ul>
       <li>MdecDecodeQuality.java</li>
    </ul>
    */
    public static ILocalizedMessage QUALITY_HIGH_DESCRIPTION() {
        return inter("QUALITY_HIGH_DESCRIPTION", "High quality (slower)");
    }

    /**
    <table border="1"><tr><td>
    <pre>high</pre>
    </td></tr></table>
    <p>1 word (no spaces) user can type on command-line. Not case sensitive</p>
    <ul>
       <li>MdecDecodeQuality.java</li>
    </ul>
    */
    public static ILocalizedMessage QUALITY_HIGH_COMMAND() {
        return inter("QUALITY_HIGH_COMMAND", "high");
    }

    /**
    <table border="1"><tr><td>
    <pre>Fast (lower quality)</pre>
    </td></tr></table>
    <ul>
       <li>MdecDecodeQuality.java</li>
    </ul>
    */
    public static ILocalizedMessage QUALITY_FAST_DESCRIPTION() {
        return inter("QUALITY_FAST_DESCRIPTION", "Fast (lower quality)");
    }

    /**
    <table border="1"><tr><td>
    <pre>low</pre>
    </td></tr></table>
    <p>1 word (no spaces) user can type on command-line. Not case sensitive</p>
    <ul>
       <li>MdecDecodeQuality.java</li>
    </ul>
    */
    public static ILocalizedMessage QUALITY_FAST_COMMAND() {
        return inter("QUALITY_FAST_COMMAND", "low");
    }

    /**
    <table border="1"><tr><td>
    <pre>Emulate PSX (low) quality</pre>
    </td></tr></table>
    <ul>
       <li>MdecDecodeQuality.java</li>
    </ul>
    */
    public static ILocalizedMessage QUALITY_PSX_DESCRIPTION() {
        return inter("QUALITY_PSX_DESCRIPTION", "Emulate PSX (low) quality");
    }

    /**
    <table border="1"><tr><td>
    <pre>psx</pre>
    </td></tr></table>
    <p>1 word (no spaces) user can type on command-line. Not case sensitive</p>
    <ul>
       <li>MdecDecodeQuality.java</li>
    </ul>
    */
    public static ILocalizedMessage QUALITY_PSX_COMMAND() {
        return inter("QUALITY_PSX_COMMAND", "psx");
    }

    /**
    <table border="1"><tr><td>
    <pre>Bicubic</pre>
    </td></tr></table>
    <ul>
       <li>MdecDecoder_double_interpolate.java</li>
    </ul>
    */
    public static ILocalizedMessage CHROMA_UPSAMPLE_BICUBIC_DESCRIPTION() {
        return inter("CHROMA_UPSAMPLE_BICUBIC_DESCRIPTION", "Bicubic");
    }

    /**
    <table border="1"><tr><td>
    <pre>Bicubic</pre>
    </td></tr></table>
    <p>1 word (no spaces) user can type on command-line. Not case sensitive</p>
    <ul>
       <li>MdecDecoder_double_interpolate.java</li>
    </ul>
    */
    public static ILocalizedMessage CHROMA_UPSAMPLE_BICUBIC_CMDLINE() {
        return inter("CHROMA_UPSAMPLE_BICUBIC_CMDLINE", "Bicubic");
    }

    /**
    <table border="1"><tr><td>
    <pre>Bell</pre>
    </td></tr></table>
    <ul>
       <li>MdecDecoder_double_interpolate.java</li>
    </ul>
    */
    public static ILocalizedMessage CHROMA_UPSAMPLE_BELL_DESCRIPTION() {
        return inter("CHROMA_UPSAMPLE_BELL_DESCRIPTION", "Bell");
    }

    /**
    <table border="1"><tr><td>
    <pre>Bell</pre>
    </td></tr></table>
    <p>1 word (no spaces) user can type on command-line. Not case sensitive</p>
    <ul>
       <li>MdecDecoder_double_interpolate.java</li>
    </ul>
    */
    public static ILocalizedMessage CHROMA_UPSAMPLE_BELL_CMDLINE() {
        return inter("CHROMA_UPSAMPLE_BELL_CMDLINE", "Bell");
    }

    /**
    <table border="1"><tr><td>
    <pre>Nearest Neighbor</pre>
    </td></tr></table>
    <ul>
       <li>MdecDecoder_double_interpolate.java</li>
    </ul>
    */
    public static ILocalizedMessage CHROMA_UPSAMPLE_NEAR_NEIGHBOR_DESCRIPTION() {
        return inter("CHROMA_UPSAMPLE_NEAR_NEIGHBOR_DESCRIPTION", "Nearest Neighbor");
    }

    /**
    <table border="1"><tr><td>
    <pre>NearestNeighbor</pre>
    </td></tr></table>
    <p>1 word (no spaces) user can type on command-line. Not case sensitive</p>
    <ul>
       <li>MdecDecoder_double_interpolate.java</li>
    </ul>
    */
    public static ILocalizedMessage CHROMA_UPSAMPLE_NEAR_NEIGHBOR_CMDLINE() {
        return inter("CHROMA_UPSAMPLE_NEAR_NEIGHBOR_CMDLINE", "NearestNeighbor");
    }

    /**
    <table border="1"><tr><td>
    <pre>Lanczos3</pre>
    </td></tr></table>
    <ul>
       <li>MdecDecoder_double_interpolate.java</li>
    </ul>
    */
    public static ILocalizedMessage CHROMA_UPSAMPLE_LANCZOS3_DESCRIPTION() {
        return inter("CHROMA_UPSAMPLE_LANCZOS3_DESCRIPTION", "Lanczos3");
    }

    /**
    <table border="1"><tr><td>
    <pre>Lanczos3</pre>
    </td></tr></table>
    <p>1 word (no spaces) user can type on command-line. Not case sensitive</p>
    <ul>
       <li>MdecDecoder_double_interpolate.java</li>
    </ul>
    */
    public static ILocalizedMessage CHROMA_UPSAMPLE_LANCZOS3_CMDLINE() {
        return inter("CHROMA_UPSAMPLE_LANCZOS3_CMDLINE", "Lanczos3");
    }

    /**
    <table border="1"><tr><td>
    <pre>Mitchell</pre>
    </td></tr></table>
    <ul>
       <li>MdecDecoder_double_interpolate.java</li>
    </ul>
    */
    public static ILocalizedMessage CHROMA_UPSAMPLE_MITCHELL_DESCRIPTION() {
        return inter("CHROMA_UPSAMPLE_MITCHELL_DESCRIPTION", "Mitchell");
    }

    /**
    <table border="1"><tr><td>
    <pre>Mitchell</pre>
    </td></tr></table>
    <p>1 word (no spaces) user can type on command-line. Not case sensitive</p>
    <ul>
       <li>MdecDecoder_double_interpolate.java</li>
    </ul>
    */
    public static ILocalizedMessage CHROMA_UPSAMPLE_MITCHELL_CMDLINE() {
        return inter("CHROMA_UPSAMPLE_MITCHELL_CMDLINE", "Mitchell");
    }

    /**
    <table border="1"><tr><td>
    <pre>Hermite</pre>
    </td></tr></table>
    <ul>
       <li>MdecDecoder_double_interpolate.java</li>
    </ul>
    */
    public static ILocalizedMessage CHROMA_UPSAMPLE_HERMITE_DESCRIPTION() {
        return inter("CHROMA_UPSAMPLE_HERMITE_DESCRIPTION", "Hermite");
    }

    /**
    <table border="1"><tr><td>
    <pre>Hermite</pre>
    </td></tr></table>
    <p>1 word (no spaces) user can type on command-line. Not case sensitive</p>
    <ul>
       <li>MdecDecoder_double_interpolate.java</li>
    </ul>
    */
    public static ILocalizedMessage CHROMA_UPSAMPLE_HERMITE_CMDLINE() {
        return inter("CHROMA_UPSAMPLE_HERMITE_CMDLINE", "Hermite");
    }

    /**
    <table border="1"><tr><td>
    <pre>BSpline</pre>
    </td></tr></table>
    <ul>
       <li>MdecDecoder_double_interpolate.java</li>
    </ul>
    */
    public static ILocalizedMessage CHROMA_UPSAMPLE_BSPLINE_DESCRIPTION() {
        return inter("CHROMA_UPSAMPLE_BSPLINE_DESCRIPTION", "BSpline");
    }

    /**
    <table border="1"><tr><td>
    <pre>BSpline</pre>
    </td></tr></table>
    <p>1 word (no spaces) user can type on command-line. Not case sensitive</p>
    <ul>
       <li>MdecDecoder_double_interpolate.java</li>
    </ul>
    */
    public static ILocalizedMessage CHROMA_UPSAMPLE_BSPLINE_CMDLINE() {
        return inter("CHROMA_UPSAMPLE_BSPLINE_CMDLINE", "BSpline");
    }

    /**
    <table border="1"><tr><td>
    <pre>Bilinear</pre>
    </td></tr></table>
    <ul>
       <li>MdecDecoder_double_interpolate.java</li>
    </ul>
    */
    public static ILocalizedMessage CHROMA_UPSAMPLE_BILINEAR_DESCRIPTION() {
        return inter("CHROMA_UPSAMPLE_BILINEAR_DESCRIPTION", "Bilinear");
    }

    /**
    <table border="1"><tr><td>
    <pre>Bilinear</pre>
    </td></tr></table>
    <p>1 word (no spaces) user can type on command-line. Not case sensitive</p>
    <ul>
       <li>MdecDecoder_double_interpolate.java</li>
    </ul>
    */
    public static ILocalizedMessage CHROMA_UPSAMPLE_BILINEAR_CMDLINE() {
        return inter("CHROMA_UPSAMPLE_BILINEAR_CMDLINE", "Bilinear");
    }

    /**
    <table border="1"><tr><td>
    <pre>{0} ({1})</pre>
    </td></tr></table>
    <p>See CHROMA_UPSAMPLE_*_DESCRIPTION and CHROMA_UPSAMPLE_*_CMDLINE</p>
    <ul>
       <li>MdecDecoder_double_interpolate.java</li>
    </ul>
    */
    public static ILocalizedMessage CHROMA_UPSAMPLE_CMDLINE_HELP(@Nonnull ILocalizedMessage commandLineId, @Nonnull ILocalizedMessage interplationName) {
        return inter("CHROMA_UPSAMPLE_CMDLINE_HELP", "{0} ({1})", commandLineId, interplationName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Replacement frame file {0} dimensions {1,number,#}x{2,number} do not match frame to replace dimensions {3,number,#}x{4,number}</pre>
    </td></tr></table>
    <ul>
       <li>ReplaceFrame.java</li>
    </ul>
    */
    public static ILocalizedMessage REPLACE_FRAME_DIMENSIONS_MISMATCH(@Nonnull String imageFile, int sourceWidth, int sourceHeight, int replaceWidth, int replaceHeight) {
        return inter("REPLACE_FRAME_DIMENSIONS_MISMATCH", "Replacement frame file {0} dimensions {1,number,#}x{2,number} do not match frame to replace dimensions {3,number,#}x{4,number}", imageFile, sourceWidth, sourceHeight, replaceWidth, replaceHeight);
    }

    /**
    <table border="1"><tr><td>
    <pre>Bitstream frame file {0} type does not match existing frame type</pre>
    </td></tr></table>
    <ul>
       <li>ReplaceFrame.java</li>
    </ul>
    */
    public static ILocalizedMessage REPLACE_BITSTREAM_MISMATCH(@Nonnull java.io.File bitstreamFile) {
        return inter("REPLACE_BITSTREAM_MISMATCH", "Bitstream frame file {0} type does not match existing frame type", bitstreamFile);
    }

    /**
    <table border="1"><tr><td>
    <pre>Incompatible mdec file {0} for frame {1}</pre>
    </td></tr></table>
    <p>&quot;mdec&quot; is a file type</p>
    <ul>
       <li>ReplaceFrame.java</li>
    </ul>
    */
    public static ILocalizedMessage REPLACE_INCOMPATIBLE_MDEC(@Nonnull String mdecFileName, @Nonnull String frameNumber) {
        return inter("REPLACE_INCOMPATIBLE_MDEC", "Incompatible mdec file {0} for frame {1}", mdecFileName, frameNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Incomplete mdec file {0} for frame {1}</pre>
    </td></tr></table>
    <p>&quot;mdec&quot; is a file type</p>
    <ul>
       <li>ReplaceFrame.java</li>
    </ul>
    */
    public static ILocalizedMessage REPLACE_INCOMPLETE_MDEC(@Nonnull String mdecFileName, @Nonnull String frameNumber) {
        return inter("REPLACE_INCOMPLETE_MDEC", "Incomplete mdec file {0} for frame {1}", mdecFileName, frameNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Corrupted mdec file {0} for frame {1}</pre>
    </td></tr></table>
    <p>&quot;mdec&quot; is a file type</p>
    <ul>
       <li>ReplaceFrame.java</li>
    </ul>
    */
    public static ILocalizedMessage REPLACE_CORRUPTED_MDEC(@Nonnull String mdecFileName, @Nonnull String frameNumber) {
        return inter("REPLACE_CORRUPTED_MDEC", "Corrupted mdec file {0} for frame {1}", mdecFileName, frameNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Invalid replacement image format {0}</pre>
    </td></tr></table>
    <p>&quot;mdec&quot; is a file type</p>
    <ul>
       <li>ReplaceFrame.java</li>
    </ul>
    */
    public static ILocalizedMessage REPLACE_INVALID_IMAGE_FORMAT(@Nonnull String badFormatName) {
        return inter("REPLACE_INVALID_IMAGE_FORMAT", "Invalid replacement image format {0}", badFormatName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Unable to read {0} as an image. Did you forget ''format'' option in the XML?</pre>
    </td></tr></table>
    <p>&quot;format&quot; is an XML tag so should not be translated</p>
    <ul>
       <li>ReplaceFrame.java</li>
    </ul>
    */
    public static ILocalizedMessage REPLACE_FILE_NOT_JAVA_IMAGE(@Nonnull java.io.File fileName) {
        return inter("REPLACE_FILE_NOT_JAVA_IMAGE", "Unable to read {0} as an image. Did you forget ''format'' option in the XML?", fileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Unable to identify frame type</pre>
    </td></tr></table>
    */
    public static ILocalizedMessage CMD_UNABLE_TO_IDENTIFY_FRAME_TYPE() {
        return inter("CMD_UNABLE_TO_IDENTIFY_FRAME_TYPE", "Unable to identify frame type");
    }

    /**
    <table border="1"><tr><td>
    <pre>Unable to compress frame {0} small enough to fit in {1,number,#} bytes!!!</pre>
    </td></tr></table>
    <ul>
       <li>ReplaceFrame.java</li>
       <li>ReplaceFramePartial.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_UNABLE_TO_COMPRESS_FRAME_SMALL_ENOUGH(@Nonnull String frameNumber, int maxSize) {
        return inter("CMD_UNABLE_TO_COMPRESS_FRAME_SMALL_ENOUGH", "Unable to compress frame {0} small enough to fit in {1,number,#} bytes!!!", frameNumber, maxSize);
    }

    /**
    <table border="1"><tr><td>
    <pre>No differences found, skipping.</pre>
    </td></tr></table>
    <ul>
       <li>ReplaceFramePartial.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_NO_DIFFERENCE_SKIPPING() {
        return inter("CMD_NO_DIFFERENCE_SKIPPING", "No differences found, skipping.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Found {0,number,#} different macroblocks (16x16)</pre>
    </td></tr></table>
    <ul>
       <li>ReplaceFramePartial.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_REPLACE_FOUND_DIFFERENT_MACRO_BLOCKS(int differenceCount) {
        return inter("CMD_REPLACE_FOUND_DIFFERENT_MACRO_BLOCKS", "Found {0,number,#} different macroblocks (16x16)", differenceCount);
    }

    /**
    <table border="1"><tr><td>
    <pre>Warning: Entire frame is different.</pre>
    </td></tr></table>
    <ul>
       <li>ReplaceFramePartial.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_ENTIRE_FRAME_DIFFERENT() {
        return inter("CMD_ENTIRE_FRAME_DIFFERENT", "Warning: Entire frame is different.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Unable to load {0} as image</pre>
    </td></tr></table>
    <ul>
       <li>ReplaceFramePartial.java</li>
    </ul>
    */
    public static ILocalizedMessage REPLACE_UNABLE_READ_IMAGE(@Nonnull java.io.File fileName) {
        return inter("REPLACE_UNABLE_READ_IMAGE", "Unable to load {0} as image", fileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Replacement frame dimensions smaller than source frame</pre>
    </td></tr></table>
    <ul>
       <li>ReplaceFramePartial.java</li>
    </ul>
    */
    public static ILocalizedMessage REPLACE_FRAME_DIMENSIONS_TOO_SMALL() {
        return inter("REPLACE_FRAME_DIMENSIONS_TOO_SMALL", "Replacement frame dimensions smaller than source frame");
    }

    /**
    <table border="1"><tr><td>
    <pre>Replacing frame {0} with {1}</pre>
    </td></tr></table>
    <ul>
       <li>ReplaceFrames.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_REPLACING_FRAME_WITH_FILE(@Nonnull jpsxdec.discitems.FrameNumber frameNumber, @Nonnull java.io.File fileName) {
        return inter("CMD_REPLACING_FRAME_WITH_FILE", "Replacing frame {0} with {1}", frameNumber, fileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Error with frame replacement xml: {0}</pre>
    </td></tr></table>
    <p>Unfortunately the description of the error in the xml file is only available in English</p>
    <ul>
       <li>ReplaceFrames.java</li>
    </ul>
    */
    public static ILocalizedMessage REPLACE_FRAME_XML_ERROR(@Nonnull String xmlErrorInEnglish) {
        return inter("REPLACE_FRAME_XML_ERROR", "Error with frame replacement xml: {0}", xmlErrorInEnglish);
    }

    /**
    <table border="1"><tr><td>
    <pre>Invalid root node {0}</pre>
    </td></tr></table>
    <ul>
       <li>ReplaceFrames.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_REPLACE_XML_INVALID_ROOT_NODE(@Nonnull String xmlRootNodeName) {
        return inter("CMD_REPLACE_XML_INVALID_ROOT_NODE", "Invalid root node {0}", xmlRootNodeName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Invalid version {0}</pre>
    </td></tr></table>
    <ul>
       <li>ReplaceFrames.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_REPLACE_XML_INVALID_VERSION(@Nonnull String versionNumber) {
        return inter("CMD_REPLACE_XML_INVALID_VERSION", "Invalid version {0}", versionNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Complete | See {0} for details</pre>
    </td></tr></table>
    <ul>
       <li>SavingGui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SAVE_STATUS_OVERALL_COMPLETE(@Nonnull String fileName) {
        return inter("GUI_SAVE_STATUS_OVERALL_COMPLETE", "Complete | See {0} for details", fileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Canceled | See {0} for details</pre>
    </td></tr></table>
    <ul>
       <li>SavingGui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SAVE_STATUS_OVERALL_CANCELED(@Nonnull String fileName) {
        return inter("GUI_SAVE_STATUS_OVERALL_CANCELED", "Canceled | See {0} for details", fileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Failed!</pre>
    </td></tr></table>
    <ul>
       <li>SavingGuiTable.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SAVE_STATUS_FAILED() {
        return inter("GUI_SAVE_STATUS_FAILED", "Failed!");
    }

    /**
    <table border="1"><tr><td>
    <pre>Canceled</pre>
    </td></tr></table>
    <ul>
       <li>SavingGuiTable.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SAVE_STATUS_CANCELED() {
        return inter("GUI_SAVE_STATUS_CANCELED", "Canceled");
    }

    /**
    <table border="1"><tr><td>
    <pre>Source</pre>
    </td></tr></table>
    <ul>
       <li>SavingGuiTable.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SRC_COLUMN() {
        return inter("GUI_SRC_COLUMN", "Source");
    }

    /**
    <table border="1"><tr><td>
    <pre>Err</pre>
    </td></tr></table>
    <ul>
       <li>SavingGuiTable.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_ERR_COLUMN() {
        return inter("GUI_ERR_COLUMN", "Err");
    }

    /**
    <table border="1"><tr><td>
    <pre>Save As</pre>
    </td></tr></table>
    <ul>
       <li>SavingGuiTable.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SAVE_AS_COLUMN() {
        return inter("GUI_SAVE_AS_COLUMN", "Save As");
    }

    /**
    <table border="1"><tr><td>
    <pre>Waiting</pre>
    </td></tr></table>
    <ul>
       <li>SavingGuiTable.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SAVE_STATUS_WAITING() {
        return inter("GUI_SAVE_STATUS_WAITING", "Waiting");
    }

    /**
    <table border="1"><tr><td>
    <pre>Message</pre>
    </td></tr></table>
    <ul>
       <li>SavingGuiTable.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_MESSAGE_COLUMN() {
        return inter("GUI_MESSAGE_COLUMN", "Message");
    }

    /**
    <table border="1"><tr><td>
    <pre>Done</pre>
    </td></tr></table>
    <ul>
       <li>SavingGuiTable.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SAVE_STATUS_DONE() {
        return inter("GUI_SAVE_STATUS_DONE", "Done");
    }

    /**
    <table border="1"><tr><td>
    <pre>Progress</pre>
    </td></tr></table>
    <ul>
       <li>SavingGuiTable.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_PROGRESS_COLUMN() {
        return inter("GUI_PROGRESS_COLUMN", "Progress");
    }

    /**
    <table border="1"><tr><td>
    <pre>Warn</pre>
    </td></tr></table>
    <ul>
       <li>SavingGuiTable.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_WARN_COLUMN() {
        return inter("GUI_WARN_COLUMN", "Warn");
    }

    /**
    <table border="1"><tr><td>
    <pre>Frame type is not STRv1 or STRv2</pre>
    </td></tr></table>
    <ul>
       <li>SectorFF7Video.java</li>
    </ul>
    */
    public static ILocalizedMessage REPLACE_FRAME_TYPE_NOT_V1_V2() {
        return inter("REPLACE_FRAME_TYPE_NOT_V1_V2", "Frame type is not STRv1 or STRv2");
    }

    /**
    <table border="1"><tr><td>
    <pre>Frame type is not STRv2 or STRv3</pre>
    </td></tr></table>
    <ul>
       <li>SectorAbstractVideo.java</li>
    </ul>
    */
    public static ILocalizedMessage REPLACE_FRAME_TYPE_NOT_V2_V3() {
        return inter("REPLACE_FRAME_TYPE_NOT_V2_V3", "Frame type is not STRv2 or STRv3");
    }

    /**
    <table border="1"><tr><td>
    <pre>Frame type is not STRv2</pre>
    </td></tr></table>
    <ul>
       <li>SectorFF9.java</li>
    </ul>
    */
    public static ILocalizedMessage REPLACE_FRAME_TYPE_NOT_V2() {
        return inter("REPLACE_FRAME_TYPE_NOT_V2", "Frame type is not STRv2");
    }

    /**
    <table border="1"><tr><td>
    <pre>Frame type is not iki</pre>
    </td></tr></table>
    <ul>
       <li>SectorGTVideo.java</li>
       <li>SectorIkiVideo.java</li>
    </ul>
    */
    public static ILocalizedMessage REPLACE_FRAME_TYPE_NOT_IKI() {
        return inter("REPLACE_FRAME_TYPE_NOT_IKI", "Frame type is not iki");
    }

    /**
    <table border="1"><tr><td>
    <pre>Iki frame dimensions do not match sector dimensions: {0,number,#}x{1,number,#} != {2,number,#}x{3,number,#}</pre>
    </td></tr></table>
    <ul>
       <li>SectorGTVideo.java</li>
       <li>SectorIkiVideo.java</li>
    </ul>
    */
    public static ILocalizedMessage REPLACE_FRAME_IKI_DIMENSIONS_MISMATCH(int sourceWidth, int sourceHeight, int replaceWidth, int replaceHeight) {
        return inter("REPLACE_FRAME_IKI_DIMENSIONS_MISMATCH", "Iki frame dimensions do not match sector dimensions: {0,number,#}x{1,number,#} != {2,number,#}x{3,number,#}", sourceWidth, sourceHeight, replaceWidth, replaceHeight);
    }

    /**
    <table border="1"><tr><td>
    <pre>Incompatible frame data for Lain</pre>
    </td></tr></table>
    <ul>
       <li>SectorLainVideo.java</li>
    </ul>
    */
    public static ILocalizedMessage REPLACE_FRAME_TYPE_NOT_LAIN() {
        return inter("REPLACE_FRAME_TYPE_NOT_LAIN", "Incompatible frame data for Lain");
    }

    /**
    <table border="1"><tr><td>
    <pre>Unexpected end of audio data</pre>
    </td></tr></table>
    */
    public static ILocalizedMessage UNEXPECTED_END_OF_AUDIO() {
        return inter("UNEXPECTED_END_OF_AUDIO", "Unexpected end of audio data");
    }

    /**
    <table border="1"><tr><td>
    <pre>Copy to clipboard</pre>
    </td></tr></table>
    <ul>
       <li>TimPaletteSelector.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_COPY_TO_CLIPBOARD_TOOLTIP() {
        return inter("GUI_COPY_TO_CLIPBOARD_TOOLTIP", "Copy to clipboard");
    }

    /**
    <table border="1"><tr><td>
    <pre>Unable to write image file {0} for palette {1,number,#}</pre>
    </td></tr></table>
    <ul>
       <li>TimSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_PALETTE_IMAGE_SAVE_FAIL(@Nonnull java.io.File outputFile, int paletteIndex) {
        return inter("CMD_PALETTE_IMAGE_SAVE_FAIL", "Unable to write image file {0} for palette {1,number,#}", outputFile, paletteIndex);
    }

    /**
    <table border="1"><tr><td>
    <pre>Format: {0}</pre>
    </td></tr></table>
    <ul>
       <li>TimSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_TIM_SAVE_FORMAT(@Nonnull String fileFormat) {
        return inter("CMD_TIM_SAVE_FORMAT", "Format: {0}", fileFormat);
    }

    /**
    <table border="1"><tr><td>
    <pre>Invalid format {0}</pre>
    </td></tr></table>
    <ul>
       <li>TimSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_TIM_SAVE_FORMAT_INVALID(@Nonnull String badFileFormat) {
        return inter("CMD_TIM_SAVE_FORMAT_INVALID", "Invalid format {0}", badFileFormat);
    }

    /**
    <table border="1"><tr><td>
    <pre>Invalid list of palettes {0}</pre>
    </td></tr></table>
    <ul>
       <li>TimSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_TIM_PALETTE_LIST_INVALID(@Nonnull String badPaletteList) {
        return inter("CMD_TIM_PALETTE_LIST_INVALID", "Invalid list of palettes {0}", badPaletteList);
    }

    /**
    <table border="1"><tr><td>
    <pre>-pal &lt;#,#-#&gt;</pre>
    </td></tr></table>
    <p>Note that the command -pal is hard-coded</p>
    <ul>
       <li>TimSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_TIM_PAL() {
        return inter("CMD_TIM_PAL", "-pal <#,#-#>");
    }

    /**
    <table border="1"><tr><td>
    <pre>Palettes to save (default all).</pre>
    </td></tr></table>
    <ul>
       <li>TimSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_TIM_PAL_HELP() {
        return inter("CMD_TIM_PAL_HELP", "Palettes to save (default all).");
    }

    /**
    <table border="1"><tr><td>
    <pre>-imgfmt,-if &lt;format&gt;</pre>
    </td></tr></table>
    <p>Note that the commands -imgfmt and -if are hard-coded</p>
    <ul>
       <li>TimSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_TIM_IF() {
        return inter("CMD_TIM_IF", "-imgfmt,-if <format>");
    }

    /**
    <table border="1"><tr><td>
    <pre>Output image format (default {0}). Options:</pre>
    </td></tr></table>
    <ul>
       <li>TimSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_TIM_IF_HELP(@Nonnull String defaultImageFormat) {
        return inter("CMD_TIM_IF_HELP", "Output image format (default {0}). Options:", defaultImageFormat);
    }

    /**
    <table border="1"><tr><td>
    <pre>Palette files: {0}</pre>
    </td></tr></table>
    <p>See TIM_OUTPUT_FILES*</p>
    <ul>
       <li>TimSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_TIM_PALETTE_FILES(@Nonnull ILocalizedMessage ouputFiles) {
        return inter("CMD_TIM_PALETTE_FILES", "Palette files: {0}", ouputFiles);
    }

    /**
    <table border="1"><tr><td>
    <pre>{0,number,#} files between {1}-{2}</pre>
    </td></tr></table>
    <ul>
       <li>TimSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage TIM_OUTPUT_FILES(int fileCount, @Nonnull String startFileName, @Nonnull String endFileName) {
        return inter("TIM_OUTPUT_FILES", "{0,number,#} files between {1}-{2}", fileCount, startFileName, endFileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>None</pre>
    </td></tr></table>
    <ul>
       <li>TimSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage TIM_OUTPUT_FILES_NONE() {
        return inter("TIM_OUTPUT_FILES_NONE", "None");
    }

    /**
    <table border="1"><tr><td>
    <pre>TIM image data not found</pre>
    </td></tr></table>
    <p>If TIM image data is not found where it should be on the disc</p>
    <ul>
       <li>TimSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage TIM_DATA_NOT_FOUND() {
        return inter("TIM_DATA_NOT_FOUND", "TIM image data not found");
    }

    /**
    <table border="1"><tr><td>
    <pre>Format:</pre>
    </td></tr></table>
    <ul>
       <li>TimSaverBuilderGui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_TIM_SAVE_FORMAT_LABEL() {
        return inter("GUI_TIM_SAVE_FORMAT_LABEL", "Format:");
    }

    /**
    <table border="1"><tr><td>
    <pre>Error reading TIM preview
{0}</pre>
    </td></tr></table>
    <p>{0} is a multi-line exception stack trace</p>
    <ul>
       <li>TimSaverBuilderGui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_TIM_ERR_READING_PREVIEW(@Nonnull String listOfSourceCodeLineNumbers) {
        return inter("GUI_TIM_ERR_READING_PREVIEW", "Error reading TIM preview\n{0}", listOfSourceCodeLineNumbers);
    }

    /**
    <table border="1"><tr><td>
    <pre>[{0}] {1}</pre>
    </td></tr></table>
    <ul>
       <li>UserFriendlyLogger.java</li>
    </ul>
    */
    public static ILocalizedMessage USER_LOG_MESSAGE(@Nonnull String logLevel, @Nonnull String logMessage) {
        return inter("USER_LOG_MESSAGE", "[{0}] {1}", logLevel, logMessage);
    }

    /**
    <table border="1"><tr><td>
    <pre>[{0}] {1} {2}</pre>
    </td></tr></table>
    */
    public static ILocalizedMessage USER_LOG_MESSAGE_EXCEPTION(@Nonnull String logLevel, @Nonnull String logMessage, @Nonnull String exceptionName) {
        return inter("USER_LOG_MESSAGE_EXCEPTION", "[{0}] {1} {2}", logLevel, logMessage, exceptionName);
    }

    /**
    <table border="1"><tr><td>
    <pre>[{0}] {1} {2} : {3}</pre>
    </td></tr></table>
    */
    public static ILocalizedMessage USER_LOG_MESSAGE_EXCEPTION_MSG(@Nonnull String logLevel, @Nonnull String logMessage, @Nonnull String exceptionName, @Nonnull String exceptionMessage) {
        return inter("USER_LOG_MESSAGE_EXCEPTION_MSG", "[{0}] {1} {2} : {3}", logLevel, logMessage, exceptionName, exceptionMessage);
    }

    /**
    <table border="1"><tr><td>
    <pre>[{0}] {1}</pre>
    </td></tr></table>
    */
    public static ILocalizedMessage USER_LOG_EXCEPTION(@Nonnull String logLevel, @Nonnull String exceptionName) {
        return inter("USER_LOG_EXCEPTION", "[{0}] {1}", logLevel, exceptionName);
    }

    /**
    <table border="1"><tr><td>
    <pre>[{0}] {1} : {2}</pre>
    </td></tr></table>
    */
    public static ILocalizedMessage USER_LOG_EXCEPTION_MSG(@Nonnull String logLevel, @Nonnull String exceptionName, @Nonnull String exceptionMessage) {
        return inter("USER_LOG_EXCEPTION_MSG", "[{0}] {1} : {2}", logLevel, exceptionName, exceptionMessage);
    }

    /**
    <table border="1"><tr><td>
    <pre>Error with frame {0}: Frame is corrupted</pre>
    </td></tr></table>
    <ul>
       <li>VDP.java</li>
       <li>ReplaceFrame.java</li>
       <li>ReplaceFramePartial.java</li>
    </ul>
    */
    public static ILocalizedMessage FRAME_NUM_CORRUPTED(@Nonnull String frameNumber) {
        return inter("FRAME_NUM_CORRUPTED", "Error with frame {0}: Frame is corrupted", frameNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Error with frame {0}: Frame is incomplete</pre>
    </td></tr></table>
    <ul>
       <li>VDP.java</li>
       <li>ReplaceFrame.java</li>
       <li>ReplaceFramePartial.java</li>
    </ul>
    */
    public static ILocalizedMessage FRAME_NUM_INCOMPLETE(@Nonnull String frameNumber) {
        return inter("FRAME_NUM_INCOMPLETE", "Error with frame {0}: Frame is incomplete", frameNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Error with frame {0}: Unable to determine frame type.</pre>
    </td></tr></table>
    <ul>
       <li>ReplaceFrame.java</li>
       <li>ReplaceFramePartial.java</li>
       <li>VDP.java</li>
    </ul>
    */
    public static ILocalizedMessage UNABLE_TO_DETERMINE_FRAME_TYPE_FRM(@Nonnull String frameNumber) {
        return inter("UNABLE_TO_DETERMINE_FRAME_TYPE_FRM", "Error with frame {0}: Unable to determine frame type.", frameNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Frame {0} is ahead of reading by {1,number,#} frame(s).</pre>
    </td></tr></table>
    <ul>
       <li>VDP.java</li>
    </ul>
    */
    public static ILocalizedMessage FRAME_NUM_AHEAD_OF_READING(@Nonnull jpsxdec.discitems.FrameNumber frameNumber, int frameCount) {
        return inter("FRAME_NUM_AHEAD_OF_READING", "Frame {0} is ahead of reading by {1,number,#} frame(s).", frameNumber, frameCount);
    }

    /**
    <table border="1"><tr><td>
    <pre>Unable to write frame file {0} for frame {1}</pre>
    </td></tr></table>
    <ul>
       <li>VDP.java</li>
    </ul>
    */
    public static ILocalizedMessage FRAME_FILE_WRITE_UNABLE(@Nonnull java.io.File fileName, @Nonnull jpsxdec.discitems.FrameNumber frameNumber) {
        return inter("FRAME_FILE_WRITE_UNABLE", "Unable to write frame file {0} for frame {1}", fileName, frameNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Video format identified as {0}</pre>
    </td></tr></table>
    <ul>
       <li>VDP.java</li>
    </ul>
    */
    public static ILocalizedMessage VIDEO_FMT_IDENTIFIED(@Nonnull String formatIdentifier) {
        return inter("VIDEO_FMT_IDENTIFIED", "Video format identified as {0}", formatIdentifier);
    }

    /**
    <table border="1"><tr><td>
    <pre>Error uncompressing frame {0}</pre>
    </td></tr></table>
    */
    public static ILocalizedMessage FRAME_UNCOMPRESS_ERR(@Nonnull jpsxdec.discitems.FrameNumber frameNumber) {
        return inter("FRAME_UNCOMPRESS_ERR", "Error uncompressing frame {0}", frameNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>The simple jPSXdec JPEG encoder can''t handle frame {0}. Please save in a different format.</pre>
    </td></tr></table>
    <ul>
       <li>VDP.java</li>
    </ul>
    */
    public static ILocalizedMessage JPEG_ENCODER_FRAME_FAIL(@Nonnull jpsxdec.discitems.FrameNumber frameNumber) {
        return inter("JPEG_ENCODER_FRAME_FAIL", "The simple jPSXdec JPEG encoder can''t handle frame {0}. Please save in a different format.", frameNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Writing {0,number,#} blank frame(s) to align audio/video playback.</pre>
    </td></tr></table>
    <ul>
       <li>VDP.java</li>
    </ul>
    */
    public static ILocalizedMessage WRITING_BLANK_FRAMES_TO_ALIGN_AV(int frameCount) {
        return inter("WRITING_BLANK_FRAMES_TO_ALIGN_AV", "Writing {0,number,#} blank frame(s) to align audio/video playback.", frameCount);
    }

    /**
    <table border="1"><tr><td>
    <pre>Error writing file {0} for frame {1}</pre>
    </td></tr></table>
    <ul>
       <li>VDP.java</li>
    </ul>
    */
    public static ILocalizedMessage FRAME_WRITE_ERR(@Nonnull java.io.File fileName, @Nonnull jpsxdec.discitems.FrameNumber frameNumber) {
        return inter("FRAME_WRITE_ERR", "Error writing file {0} for frame {1}", fileName, frameNumber);
    }

    /**
    <table border="1"><tr><td>
    <pre>Writing {0,number,#} samples of silence to align audio/video playback.</pre>
    </td></tr></table>
    <ul>
       <li>VDP.java</li>
    </ul>
    */
    public static ILocalizedMessage WRITING_SILECE_TO_SYNC_AV(long sampleCount) {
        return inter("WRITING_SILECE_TO_SYNC_AV", "Writing {0,number,#} samples of silence to align audio/video playback.", sampleCount);
    }

    /**
    <table border="1"><tr><td>
    <pre>Adding {0,number,#} samples to keep audio in sync.</pre>
    </td></tr></table>
    <ul>
       <li>VDP.java</li>
    </ul>
    */
    public static ILocalizedMessage WRITING_SILENCE_TO_KEEP_AV_SYNCED(long sampleCount) {
        return inter("WRITING_SILENCE_TO_KEEP_AV_SYNCED", "Adding {0,number,#} samples to keep audio in sync.", sampleCount);
    }

    /**
    <table border="1"><tr><td>
    <pre>Image sequence: png</pre>
    </td></tr></table>
    <ul>
       <li>VideoFormat.java</li>
    </ul>
    */
    public static ILocalizedMessage VID_IMG_SEQ_PNG_DESCRIPTION() {
        return inter("VID_IMG_SEQ_PNG_DESCRIPTION", "Image sequence: png");
    }

    /**
    <table border="1"><tr><td>
    <pre>png</pre>
    </td></tr></table>
    <p>1 word (no spaces) user can type on command-line. Not case sensitive</p>
    <ul>
       <li>VideoFormat.java</li>
    </ul>
    */
    public static ILocalizedMessage VID_IMG_SEQ_PNG_COMMAND() {
        return inter("VID_IMG_SEQ_PNG_COMMAND", "png");
    }

    /**
    <table border="1"><tr><td>
    <pre>AVI: Compressed (MJPG)</pre>
    </td></tr></table>
    <ul>
       <li>VideoFormat.java</li>
    </ul>
    */
    public static ILocalizedMessage VID_AVI_MJPG_DESCRIPTION() {
        return inter("VID_AVI_MJPG_DESCRIPTION", "AVI: Compressed (MJPG)");
    }

    /**
    <table border="1"><tr><td>
    <pre>avi:mjpg</pre>
    </td></tr></table>
    <p>1 word (no spaces) user can type on command-line. Not case sensitive</p>
    <ul>
       <li>VideoFormat.java</li>
    </ul>
    */
    public static ILocalizedMessage VID_AVI_MJPG_COMMAND() {
        return inter("VID_AVI_MJPG_COMMAND", "avi:mjpg");
    }

    /**
    <table border="1"><tr><td>
    <pre>AVI: Uncompressed RGB</pre>
    </td></tr></table>
    <ul>
       <li>VideoFormat.java</li>
    </ul>
    */
    public static ILocalizedMessage VID_AVI_RGB_DESCRIPTION() {
        return inter("VID_AVI_RGB_DESCRIPTION", "AVI: Uncompressed RGB");
    }

    /**
    <table border="1"><tr><td>
    <pre>avi:rgb</pre>
    </td></tr></table>
    <p>1 word (no spaces) user can type on command-line. Not case sensitive</p>
    <ul>
       <li>VideoFormat.java</li>
    </ul>
    */
    public static ILocalizedMessage VID_AVI_RGB_COMMAND() {
        return inter("VID_AVI_RGB_COMMAND", "avi:rgb");
    }

    /**
    <table border="1"><tr><td>
    <pre>Image sequence: bmp</pre>
    </td></tr></table>
    <ul>
       <li>VideoFormat.java</li>
    </ul>
    */
    public static ILocalizedMessage VID_IMG_SEQ_BMP_DESCRIPTION() {
        return inter("VID_IMG_SEQ_BMP_DESCRIPTION", "Image sequence: bmp");
    }

    /**
    <table border="1"><tr><td>
    <pre>bmp</pre>
    </td></tr></table>
    <p>1 word (no spaces) user can type on command-line. Not case sensitive</p>
    <ul>
       <li>VideoFormat.java</li>
    </ul>
    */
    public static ILocalizedMessage VID_IMG_SEQ_BMP_COMMAND() {
        return inter("VID_IMG_SEQ_BMP_COMMAND", "bmp");
    }

    /**
    <table border="1"><tr><td>
    <pre>Image sequence: mdec</pre>
    </td></tr></table>
    <ul>
       <li>VideoFormat.java</li>
    </ul>
    */
    public static ILocalizedMessage VID_IMG_SEQ_MDEC_DESCRIPTION() {
        return inter("VID_IMG_SEQ_MDEC_DESCRIPTION", "Image sequence: mdec");
    }

    /**
    <table border="1"><tr><td>
    <pre>mdec</pre>
    </td></tr></table>
    <p>1 word (no spaces) user can type on command-line. Not case sensitive</p>
    <ul>
       <li>VideoFormat.java</li>
    </ul>
    */
    public static ILocalizedMessage VID_IMG_SEQ_MDEC_COMMAND() {
        return inter("VID_IMG_SEQ_MDEC_COMMAND", "mdec");
    }

    /**
    <table border="1"><tr><td>
    <pre>AVI: YUV with [0-255] range</pre>
    </td></tr></table>
    <ul>
       <li>VideoFormat.java</li>
    </ul>
    */
    public static ILocalizedMessage VID_AVI_JYUV_DESCRIPTION() {
        return inter("VID_AVI_JYUV_DESCRIPTION", "AVI: YUV with [0-255] range");
    }

    /**
    <table border="1"><tr><td>
    <pre>avi:jyuv</pre>
    </td></tr></table>
    <p>1 word (no spaces) user can type on command-line. Not case sensitive</p>
    <ul>
       <li>VideoFormat.java</li>
    </ul>
    */
    public static ILocalizedMessage VID_AVI_JYUV_COMMAND() {
        return inter("VID_AVI_JYUV_COMMAND", "avi:jyuv");
    }

    /**
    <table border="1"><tr><td>
    <pre>Image sequence: jpg</pre>
    </td></tr></table>
    <ul>
       <li>VideoFormat.java</li>
    </ul>
    */
    public static ILocalizedMessage VID_IMG_SEQ_JPG_DESCRIPTION() {
        return inter("VID_IMG_SEQ_JPG_DESCRIPTION", "Image sequence: jpg");
    }

    /**
    <table border="1"><tr><td>
    <pre>jpg</pre>
    </td></tr></table>
    <p>1 word (no spaces) user can type on command-line. Not case sensitive</p>
    <ul>
       <li>VideoFormat.java</li>
    </ul>
    */
    public static ILocalizedMessage VID_IMG_SEQ_JPG_COMMAND() {
        return inter("VID_IMG_SEQ_JPG_COMMAND", "jpg");
    }

    /**
    <table border="1"><tr><td>
    <pre>Image sequence: bitstream</pre>
    </td></tr></table>
    <ul>
       <li>VideoFormat.java</li>
    </ul>
    */
    public static ILocalizedMessage VID_IMG_SEQ_BS_DESCRIPTION() {
        return inter("VID_IMG_SEQ_BS_DESCRIPTION", "Image sequence: bitstream");
    }

    /**
    <table border="1"><tr><td>
    <pre>bs</pre>
    </td></tr></table>
    <p>1 word (no spaces) user can type on command-line. Not case sensitive</p>
    <ul>
       <li>VideoFormat.java</li>
    </ul>
    */
    public static ILocalizedMessage VID_IMG_SEQ_BS_COMMAND() {
        return inter("VID_IMG_SEQ_BS_COMMAND", "bs");
    }

    /**
    <table border="1"><tr><td>
    <pre>AVI: YUV</pre>
    </td></tr></table>
    <ul>
       <li>VideoFormat.java</li>
    </ul>
    */
    public static ILocalizedMessage VID_AVI_YUV_DESCRIPTION() {
        return inter("VID_AVI_YUV_DESCRIPTION", "AVI: YUV");
    }

    /**
    <table border="1"><tr><td>
    <pre>avi:yuv</pre>
    </td></tr></table>
    <p>1 word (no spaces) user can type on command-line. Not case sensitive</p>
    <ul>
       <li>VideoFormat.java</li>
    </ul>
    */
    public static ILocalizedMessage VID_AVI_YUV_COMMAND() {
        return inter("VID_AVI_YUV_COMMAND", "avi:yuv");
    }

    /**
    <table border="1"><tr><td>
    <pre>{0}-{1}</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaver.java</li>
    </ul>
    */
    public static ILocalizedMessage VID_RANGE_OF_FILES_TO_SAVE(@Nonnull java.io.File startFileName, @Nonnull java.io.File endFileName) {
        return inter("VID_RANGE_OF_FILES_TO_SAVE", "{0}-{1}", startFileName, endFileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Decode quality: {0}</pre>
    </td></tr></table>
    <p>See QUALITY_*_DESCRIPTION</p>
    <ul>
       <li>VideoSaver.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_DECODE_QUALITY(@Nonnull jpsxdec.discitems.savers.MdecDecodeQuality qualityDescription) {
        return inter("CMD_DECODE_QUALITY", "Decode quality: {0}", qualityDescription);
    }

    /**
    <table border="1"><tr><td>
    <pre>Output files: {0}-{1}</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaver.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_OUTPUT_FILES(@Nonnull java.io.File startFileName, @Nonnull java.io.File endFileName) {
        return inter("CMD_OUTPUT_FILES", "Output files: {0}-{1}", startFileName, endFileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>With audio item(s):</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaver.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_SAVING_WITH_AUDIO_ITEMS() {
        return inter("CMD_SAVING_WITH_AUDIO_ITEMS", "With audio item(s):");
    }

    /**
    <table border="1"><tr><td>
    <pre>Emulate PSX audio/video sync: {0,choice,0#No|1#Yes}</pre>
    </td></tr></table>
    <p>0 = No, 1 = Yes</p>
    <ul>
       <li>VideoSaver.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_EMULATE_PSX_AV_SYNC_NY(int willEmulate) {
        return inter("CMD_EMULATE_PSX_AV_SYNC_NY", "Emulate PSX audio/video sync: {0,choice,0#No|1#Yes}", willEmulate);
    }

    /**
    <table border="1"><tr><td>
    <pre>No audio</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaver.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_NO_AUDIO() {
        return inter("CMD_NO_AUDIO", "No audio");
    }

    /**
    <table border="1"><tr><td>
    <pre>Chroma upsampling: {0}</pre>
    </td></tr></table>
    <p>See CHROMA_UPSAMPLE_*_DESCRIPTION</p>
    <ul>
       <li>VideoSaver.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_UPSAMPLE_QUALITY(@Nonnull jpsxdec.psxvideo.mdec.MdecDecoder_double_interpolate.Upsampler upsampleDescription) {
        return inter("CMD_UPSAMPLE_QUALITY", "Chroma upsampling: {0}", upsampleDescription);
    }

    /**
    <table border="1"><tr><td>
    <pre>Video format: {0}</pre>
    </td></tr></table>
    <p>See VID_*_DESCRIPTION</p>
    <ul>
       <li>VideoSaver.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_VIDEO_FORMAT(@Nonnull jpsxdec.discitems.savers.VideoFormat videoFormatDescription) {
        return inter("CMD_VIDEO_FORMAT", "Video format: {0}", videoFormatDescription);
    }

    /**
    <table border="1"><tr><td>
    <pre>Skip frames before {0}</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaver.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_FRAME_RANGE_BEFORE(@Nonnull jpsxdec.discitems.savers.FrameLookup startFrame) {
        return inter("CMD_FRAME_RANGE_BEFORE", "Skip frames before {0}", startFrame);
    }

    /**
    <table border="1"><tr><td>
    <pre>Skip frames after {0}</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaver.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_FRAME_RANGE_AFTER(@Nonnull jpsxdec.discitems.savers.FrameLookup endFrame) {
        return inter("CMD_FRAME_RANGE_AFTER", "Skip frames after {0}", endFrame);
    }

    /**
    <table border="1"><tr><td>
    <pre>Cropping: {0,choice,0#No|1#Yes}</pre>
    </td></tr></table>
    <p>0 = No, 1 = Yes</p>
    <ul>
       <li>VideoSaver.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_CROPPING(int willCrop) {
        return inter("CMD_CROPPING", "Cropping: {0,choice,0#No|1#Yes}", willCrop);
    }

    /**
    <table border="1"><tr><td>
    <pre>Error closing AVI</pre>
    </td></tr></table>
    */
    public static ILocalizedMessage AVI_CLOSE_ERR() {
        return inter("AVI_CLOSE_ERR", "Error closing AVI");
    }

    /**
    <table border="1"><tr><td>
    <pre>Output file: {0}</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaver.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_OUTPUT_FILE(@Nonnull java.io.File fileName) {
        return inter("CMD_OUTPUT_FILE", "Output file: {0}", fileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Disc speed: {0,choice,1#1x|2#2x} ({1,number,#.###} fps)</pre>
    </td></tr></table>
    <p>discSpeed is 1 or 2</p>
    <ul>
       <li>VideoSaver.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_DISC_SPEED(int discSpeed, double framesPerSecond) {
        return inter("CMD_DISC_SPEED", "Disc speed: {0,choice,1#1x|2#2x} ({1,number,#.###} fps)", discSpeed, framesPerSecond);
    }

    /**
    <table border="1"><tr><td>
    <pre>-ds &lt;disc speed&gt;</pre>
    </td></tr></table>
    <p>Note that the command -ds is hard-coded</p>
    <ul>
       <li>VideoSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_VIDEO_DS() {
        return inter("CMD_VIDEO_DS", "-ds <disc speed>");
    }

    /**
    <table border="1"><tr><td>
    <pre>Specify 1 or 2 if disc speed is unknown.</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_VIDEO_DS_HELP() {
        return inter("CMD_VIDEO_DS_HELP", "Specify 1 or 2 if disc speed is unknown.");
    }

    /**
    <table border="1"><tr><td>
    <pre>-up &lt;upsampling&gt;</pre>
    </td></tr></table>
    <p>Note that the command -up is hard-coded</p>
    <ul>
       <li>VideoSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_VIDEO_UP() {
        return inter("CMD_VIDEO_UP", "-up <upsampling>");
    }

    /**
    <table border="1"><tr><td>
    <pre>Chroma upsampling method
(default {0}). Options:</pre>
    </td></tr></table>
    <p>See CHROMA_UPSAMPLE_*</p>
    <ul>
       <li>VideoSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_VIDEO_UP_HELP(@Nonnull ILocalizedMessage defaultUpsamplingMethod) {
        return inter("CMD_VIDEO_UP_HELP", "Chroma upsampling method\n(default {0}). Options:", defaultUpsamplingMethod);
    }

    /**
    <table border="1"><tr><td>
    <pre>Invalid upsample quality {0}</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_UPSAMPLE_QUALITY_INVALID(@Nonnull String badQualityName) {
        return inter("CMD_UPSAMPLE_QUALITY_INVALID", "Invalid upsample quality {0}", badQualityName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Invalid decode quality {0}</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_DECODE_QUALITY_INVALID(@Nonnull String badQualityName) {
        return inter("CMD_DECODE_QUALITY_INVALID", "Invalid decode quality {0}", badQualityName);
    }

    /**
    <table border="1"><tr><td>
    <pre>-quality,-q &lt;quality&gt;</pre>
    </td></tr></table>
    <p>Note that the commands -quality and -q are hard-coded</p>
    <ul>
       <li>VideoSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_VIDEO_QUALITY() {
        return inter("CMD_VIDEO_QUALITY", "-quality,-q <quality>");
    }

    /**
    <table border="1"><tr><td>
    <pre>Decoding quality (default {0}). Options:</pre>
    </td></tr></table>
    <p>See QUALITY_*</p>
    <ul>
       <li>VideoSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_VIDEO_QUALITY_HELP(@Nonnull ILocalizedMessage defaultQuality) {
        return inter("CMD_VIDEO_QUALITY_HELP", "Decoding quality (default {0}). Options:", defaultQuality);
    }

    /**
    <table border="1"><tr><td>
    <pre>-nocrop</pre>
    </td></tr></table>
    <p>Note that the command -nocrop is hard-coded</p>
    <ul>
       <li>VideoSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_VIDEO_NOCROP() {
        return inter("CMD_VIDEO_NOCROP", "-nocrop");
    }

    /**
    <table border="1"><tr><td>
    <pre>Don't crop data around unused frame edges.</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_VIDEO_NOCROP_HELP() {
        return inter("CMD_VIDEO_NOCROP_HELP", "Don't crop data around unused frame edges.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Invalid frame number type {0}</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_FRAME_NUMBER_TYPE_INVALID(@Nonnull String badFrameNumberType) {
        return inter("CMD_FRAME_NUMBER_TYPE_INVALID", "Invalid frame number type {0}", badFrameNumberType);
    }

    /**
    <table border="1"><tr><td>
    <pre>-frame,-frames # or #-#</pre>
    </td></tr></table>
    <p>Note that the commands -frame and -frames are hard-coded</p>
    <ul>
       <li>VideoSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_VIDEO_FRAMES() {
        return inter("CMD_VIDEO_FRAMES", "-frame,-frames # or #-#");
    }

    /**
    <table border="1"><tr><td>
    <pre>Process only frames in range.</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_VIDEO_FRAMES_HELP() {
        return inter("CMD_VIDEO_FRAMES_HELP", "Process only frames in range.");
    }

    /**
    <table border="1"><tr><td>
    <pre>-num &lt;type&gt;</pre>
    </td></tr></table>
    <p>Note that the command -num is hard-coded</p>
    <ul>
       <li>VideoSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_VIDEO_NUM() {
        return inter("CMD_VIDEO_NUM", "-num <type>");
    }

    /**
    <table border="1"><tr><td>
    <pre>Frame number to use when saving image sequence
(default {0}). Options:</pre>
    </td></tr></table>
    <p>See FRAME_NUM_FMT_*</p>
    <ul>
       <li>VideoSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_VIDEO_NUM_HELP(@Nonnull ILocalizedMessage frameNumberType) {
        return inter("CMD_VIDEO_NUM_HELP", "Frame number to use when saving image sequence\n(default {0}). Options:", frameNumberType);
    }

    /**
    <table border="1"><tr><td>
    <pre>Invalid video format {0}</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_VIDEO_FORMAT_INVALID(@Nonnull String badFormatString) {
        return inter("CMD_VIDEO_FORMAT_INVALID", "Invalid video format {0}", badFormatString);
    }

    /**
    <table border="1"><tr><td>
    <pre>-vidfmt,-vf &lt;format&gt;</pre>
    </td></tr></table>
    <p>Note that the commands -vidfmt and -vf are hard-coded</p>
    <ul>
       <li>VideoSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_VIDEO_VF() {
        return inter("CMD_VIDEO_VF", "-vidfmt,-vf <format>");
    }

    /**
    <table border="1"><tr><td>
    <pre>Output video format (default {0}).
Options:</pre>
    </td></tr></table>
    <p>See VID_*</p>
    <ul>
       <li>VideoSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_VIDEO_VF_HELP(@Nonnull ILocalizedMessage defaultVideoFormat) {
        return inter("CMD_VIDEO_VF_HELP", "Output video format (default {0}).\nOptions:", defaultVideoFormat);
    }

    /**
    <table border="1"><tr><td>
    <pre>Invalid frame(s) {0}</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverBuilder.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_FRAME_RANGE_INVALID(@Nonnull String badFrameNumberString) {
        return inter("CMD_FRAME_RANGE_INVALID", "Invalid frame(s) {0}", badFrameNumberString);
    }

    /**
    <table border="1"><tr><td>
    <pre>-noaud</pre>
    </td></tr></table>
    <p>Note that the command -noaud is hard-coded</p>
    <ul>
       <li>VideoSaverBuilderCrusader.java</li>
       <li>VideoSaverBuilderStr.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_VIDEO_NOAUD() {
        return inter("CMD_VIDEO_NOAUD", "-noaud");
    }

    /**
    <table border="1"><tr><td>
    <pre>Don't save audio.</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverBuilderCrusader.java</li>
       <li>VideoSaverBuilderStr.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_VIDEO_NOAUD_HELP() {
        return inter("CMD_VIDEO_NOAUD_HELP", "Don't save audio.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Save audio:</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverBuilderCrusaderGui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_SAVE_AUDIO_LABEL() {
        return inter("GUI_SAVE_AUDIO_LABEL", "Save audio:");
    }

    /**
    <table border="1"><tr><td>
    <pre>Decode quality:</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverPanel.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_DECODE_QUALITY_LABEL() {
        return inter("GUI_DECODE_QUALITY_LABEL", "Decode quality:");
    }

    /**
    <table border="1"><tr><td>
    <pre>{0,number,#} fps</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverPanel.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_FPS_LABLE_WHOLE_NUMBER(long framesPerSecond) {
        return inter("GUI_FPS_LABLE_WHOLE_NUMBER", "{0,number,#} fps", framesPerSecond);
    }

    /**
    <table border="1"><tr><td>
    <pre>{0,number,#.###} ({1,number,#}/{2,number,#}) fps</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverPanel.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_FPS_LABEL_FRACTION(double decimalFramesPerSecond, long framesPerSecondNumerator, long framesPerSecondDenominator) {
        return inter("GUI_FPS_LABEL_FRACTION", "{0,number,#.###} ({1,number,#}/{2,number,#}) fps", decimalFramesPerSecond, framesPerSecondNumerator, framesPerSecondDenominator);
    }

    /**
    <table border="1"><tr><td>
    <pre>Dimensions:</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverPanel.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_DIMENSIONS_LABEL() {
        return inter("GUI_DIMENSIONS_LABEL", "Dimensions:");
    }

    /**
    <table border="1"><tr><td>
    <pre>{0,number,#}x{1,number,#}</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverPanel.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_DIMENSIONS_WIDTH_X_HEIGHT_LABEL(int width, int height) {
        return inter("GUI_DIMENSIONS_WIDTH_X_HEIGHT_LABEL", "{0,number,#}x{1,number,#}", width, height);
    }

    /**
    <table border="1"><tr><td>
    <pre>{0}
to: {1}</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverPanel.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_OUTPUT_VIDEO_FILE_RANGE(@Nonnull java.io.File startFileName, @Nonnull java.io.File endFileName) {
        return inter("GUI_OUTPUT_VIDEO_FILE_RANGE", "{0}\nto: {1}", startFileName, endFileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Disc speed:</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverPanel.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_DISC_SPEED_LABEL() {
        return inter("GUI_DISC_SPEED_LABEL", "Disc speed:");
    }

    /**
    <table border="1"><tr><td>
    <pre>1x</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverPanel.java</li>
    </ul>
    */
    public static ILocalizedMessage DISC_SPEED_1X() {
        return inter("DISC_SPEED_1X", "1x");
    }

    /**
    <table border="1"><tr><td>
    <pre>2x</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverPanel.java</li>
    </ul>
    */
    public static ILocalizedMessage DISC_SPEED_2X() {
        return inter("DISC_SPEED_2X", "2x");
    }

    /**
    <table border="1"><tr><td>
    <pre>Audio volume:</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverPanel.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_AUDIO_VOLUME_LABEL() {
        return inter("GUI_AUDIO_VOLUME_LABEL", "Audio volume:");
    }

    /**
    <table border="1"><tr><td>
    <pre>Video format:</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverPanel.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_VIDEO_FORMAT_LABEL() {
        return inter("GUI_VIDEO_FORMAT_LABEL", "Video format:");
    }

    /**
    <table border="1"><tr><td>
    <pre>Crop</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverPanel.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_CROP_CHECKBOX() {
        return inter("GUI_CROP_CHECKBOX", "Crop");
    }

    /**
    <table border="1"><tr><td>
    <pre>Chroma upsampling:</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverPanel.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_CHROMA_UPSAMPLING_LABEL() {
        return inter("GUI_CHROMA_UPSAMPLING_LABEL", "Chroma upsampling:");
    }

    /**
    <table border="1"><tr><td>
    <pre>-psxav</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverBuilderStr.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_VIDEO_PSXAV() {
        return inter("CMD_VIDEO_PSXAV", "-psxav");
    }

    /**
    <table border="1"><tr><td>
    <pre>Emulate PSX audio/video timing.</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverBuilderStr.java</li>
    </ul>
    */
    public static ILocalizedMessage CMD_VIDEO_PSXAV_HELP() {
        return inter("CMD_VIDEO_PSXAV_HELP", "Emulate PSX audio/video timing.");
    }

    /**
    <table border="1"><tr><td>
    <pre>Emulate PSX a/v sync:</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverBuilderStrGui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_EMULATE_PSX_AV_SYNC_LABEL() {
        return inter("GUI_EMULATE_PSX_AV_SYNC_LABEL", "Emulate PSX a/v sync:");
    }

    /**
    <table border="1"><tr><td>
    <pre></pre>
    </td></tr></table>
    <p>Column name is empty in English</p>
    <ul>
       <li>VideoSaverBuilderStrGui.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_VID_AUDIO_SAVE_ID_COLUMN() {
        return inter("GUI_VID_AUDIO_SAVE_ID_COLUMN", "");
    }

    /**
    <table border="1"><tr><td>
    <pre>Details</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverBuilderStrGui.java</li>
       <li>GuiTree.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_TREE_DETAILS_COLUMN() {
        return inter("GUI_TREE_DETAILS_COLUMN", "Details");
    }

    /**
    <table border="1"><tr><td>
    <pre>Save</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverBuilderStrGui.java</li>
       <li>GuiTree.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_TREE_SAVE_COLUMN() {
        return inter("GUI_TREE_SAVE_COLUMN", "Save");
    }

    /**
    <table border="1"><tr><td>
    <pre>#</pre>
    </td></tr></table>
    <ul>
       <li>VideoSaverBuilderStrGui.java</li>
       <li>GuiTree.java</li>
    </ul>
    */
    public static ILocalizedMessage GUI_TREE_INDEX_NUMBER_COLUMN() {
        return inter("GUI_TREE_INDEX_NUMBER_COLUMN", "#");
    }

    /**
    <table border="1"><tr><td>
    <pre>Opening file {0}</pre>
    </td></tr></table>
    <ul>
       <li>*</li>
    </ul>
    */
    public static ILocalizedMessage IO_OPENING_FILE(@Nonnull String fileName) {
        return inter("IO_OPENING_FILE", "Opening file {0}", fileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>File not found</pre>
    </td></tr></table>
    <ul>
       <li>*</li>
    </ul>
    */
    public static ILocalizedMessage IO_OPENING_FILE_NOT_FOUND() {
        return inter("IO_OPENING_FILE_NOT_FOUND", "File not found");
    }

    /**
    <table border="1"><tr><td>
    <pre>File not found {0}</pre>
    </td></tr></table>
    <ul>
       <li>*</li>
    </ul>
    */
    public static ILocalizedMessage IO_OPENING_FILE_NOT_FOUND_NAME(@Nonnull String fileName) {
        return inter("IO_OPENING_FILE_NOT_FOUND_NAME", "File not found {0}", fileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Failed to open file</pre>
    </td></tr></table>
    <ul>
       <li>*</li>
    </ul>
    */
    public static ILocalizedMessage IO_OPENING_FILE_ERROR() {
        return inter("IO_OPENING_FILE_ERROR", "Failed to open file");
    }

    /**
    <table border="1"><tr><td>
    <pre>Failed to open file {0}</pre>
    </td></tr></table>
    <ul>
       <li>*</li>
    </ul>
    */
    public static ILocalizedMessage IO_OPENING_FILE_ERROR_NAME(@Nonnull String fileName) {
        return inter("IO_OPENING_FILE_ERROR_NAME", "Failed to open file {0}", fileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Error reading file</pre>
    </td></tr></table>
    <ul>
       <li>*</li>
    </ul>
    */
    public static ILocalizedMessage IO_READING_FILE_ERROR() {
        return inter("IO_READING_FILE_ERROR", "Error reading file");
    }

    /**
    <table border="1"><tr><td>
    <pre>Error reading file {0}</pre>
    </td></tr></table>
    <ul>
       <li>*</li>
    </ul>
    */
    public static ILocalizedMessage IO_READING_FILE_ERROR_NAME(@Nonnull String fileName) {
        return inter("IO_READING_FILE_ERROR_NAME", "Error reading file {0}", fileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Error reading from file</pre>
    </td></tr></table>
    <ul>
       <li>*</li>
    </ul>
    */
    public static ILocalizedMessage IO_READING_FROM_FILE_ERROR() {
        return inter("IO_READING_FROM_FILE_ERROR", "Error reading from file");
    }

    /**
    <table border="1"><tr><td>
    <pre>Error reading from file {0}</pre>
    </td></tr></table>
    <ul>
       <li>*</li>
    </ul>
    */
    public static ILocalizedMessage IO_READING_FROM_FILE_ERROR_NAME(@Nonnull String fileName) {
        return inter("IO_READING_FROM_FILE_ERROR_NAME", "Error reading from file {0}", fileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Writing file {0}</pre>
    </td></tr></table>
    <ul>
       <li>*</li>
    </ul>
    */
    public static ILocalizedMessage IO_WRITING_FILE(@Nonnull String fileName) {
        return inter("IO_WRITING_FILE", "Writing file {0}", fileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Error writing file</pre>
    </td></tr></table>
    <ul>
       <li>*</li>
    </ul>
    */
    public static ILocalizedMessage IO_WRITING_FILE_ERROR() {
        return inter("IO_WRITING_FILE_ERROR", "Error writing file");
    }

    /**
    <table border="1"><tr><td>
    <pre>Error writing file {0}</pre>
    </td></tr></table>
    <ul>
       <li>*</li>
    </ul>
    */
    public static ILocalizedMessage IO_WRITING_FILE_ERROR_NAME(@Nonnull String fileName) {
        return inter("IO_WRITING_FILE_ERROR_NAME", "Error writing file {0}", fileName);
    }

    /**
    <table border="1"><tr><td>
    <pre>Error writing to file</pre>
    </td></tr></table>
    <ul>
       <li>*</li>
    </ul>
    */
    public static ILocalizedMessage IO_WRITING_TO_FILE_ERROR() {
        return inter("IO_WRITING_TO_FILE_ERROR", "Error writing to file");
    }

    /**
    <table border="1"><tr><td>
    <pre>Error writing to file {0}</pre>
    </td></tr></table>
    <ul>
       <li>*</li>
    </ul>
    */
    public static ILocalizedMessage IO_WRITING_TO_FILE_ERROR_NAME(@Nonnull String fileName) {
        return inter("IO_WRITING_TO_FILE_ERROR_NAME", "Error writing to file {0}", fileName);
    }

}