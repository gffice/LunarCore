// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class ChessRogueQueryScRspOuterClass {
  /**
   * Protobuf type {@code ChessRogueQueryScRsp}
   */
  public static final class ChessRogueQueryScRsp extends ProtoMessage<ChessRogueQueryScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 3;</code>
     */
    private int retcode;

    /**
     * <pre>
     * HLODEEONDBF OBGFEMEOJCE = 15;
     * HFKELKECMJE MKCLHOMEICF = 4;
     * </pre>
     *
     * <code>optional .ChessRogueQueryInfo NOGDNLNLMJH = 9;</code>
     */
    private final ChessRogueQueryInfoOuterClass.ChessRogueQueryInfo nOGDNLNLMJH = ChessRogueQueryInfoOuterClass.ChessRogueQueryInfo.newInstance();

    /**
     * <code>optional .ChessRogueNousQueryInfo rogue_nous = 10;</code>
     */
    private final ChessRogueNousQueryInfoOuterClass.ChessRogueNousQueryInfo rogueNous = ChessRogueNousQueryInfoOuterClass.ChessRogueNousQueryInfo.newInstance();

    /**
     * <code>optional .ChessRogueCurrentInfo current_info = 12;</code>
     */
    private final ChessRogueCurrentInfoOuterClass.ChessRogueCurrentInfo currentInfo = ChessRogueCurrentInfoOuterClass.ChessRogueCurrentInfo.newInstance();

    private ChessRogueQueryScRsp() {
    }

    /**
     * @return a new empty instance of {@code ChessRogueQueryScRsp}
     */
    public static ChessRogueQueryScRsp newInstance() {
      return new ChessRogueQueryScRsp();
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return this
     */
    public ChessRogueQueryScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @param value the retcode to set
     * @return this
     */
    public ChessRogueQueryScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <pre>
     * HLODEEONDBF OBGFEMEOJCE = 15;
     * HFKELKECMJE MKCLHOMEICF = 4;
     * </pre>
     *
     * <code>optional .ChessRogueQueryInfo NOGDNLNLMJH = 9;</code>
     * @return whether the nOGDNLNLMJH field is set
     */
    public boolean hasNOGDNLNLMJH() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     * HLODEEONDBF OBGFEMEOJCE = 15;
     * HFKELKECMJE MKCLHOMEICF = 4;
     * </pre>
     *
     * <code>optional .ChessRogueQueryInfo NOGDNLNLMJH = 9;</code>
     * @return this
     */
    public ChessRogueQueryScRsp clearNOGDNLNLMJH() {
      bitField0_ &= ~0x00000002;
      nOGDNLNLMJH.clear();
      return this;
    }

    /**
     * <pre>
     * HLODEEONDBF OBGFEMEOJCE = 15;
     * HFKELKECMJE MKCLHOMEICF = 4;
     * </pre>
     *
     * <code>optional .ChessRogueQueryInfo NOGDNLNLMJH = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableNOGDNLNLMJH()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChessRogueQueryInfoOuterClass.ChessRogueQueryInfo getNOGDNLNLMJH() {
      return nOGDNLNLMJH;
    }

    /**
     * <pre>
     * HLODEEONDBF OBGFEMEOJCE = 15;
     * HFKELKECMJE MKCLHOMEICF = 4;
     * </pre>
     *
     * <code>optional .ChessRogueQueryInfo NOGDNLNLMJH = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChessRogueQueryInfoOuterClass.ChessRogueQueryInfo getMutableNOGDNLNLMJH() {
      bitField0_ |= 0x00000002;
      return nOGDNLNLMJH;
    }

    /**
     * <pre>
     * HLODEEONDBF OBGFEMEOJCE = 15;
     * HFKELKECMJE MKCLHOMEICF = 4;
     * </pre>
     *
     * <code>optional .ChessRogueQueryInfo NOGDNLNLMJH = 9;</code>
     * @param value the nOGDNLNLMJH to set
     * @return this
     */
    public ChessRogueQueryScRsp setNOGDNLNLMJH(
        final ChessRogueQueryInfoOuterClass.ChessRogueQueryInfo value) {
      bitField0_ |= 0x00000002;
      nOGDNLNLMJH.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .ChessRogueNousQueryInfo rogue_nous = 10;</code>
     * @return whether the rogueNous field is set
     */
    public boolean hasRogueNous() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .ChessRogueNousQueryInfo rogue_nous = 10;</code>
     * @return this
     */
    public ChessRogueQueryScRsp clearRogueNous() {
      bitField0_ &= ~0x00000004;
      rogueNous.clear();
      return this;
    }

    /**
     * <code>optional .ChessRogueNousQueryInfo rogue_nous = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueNous()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChessRogueNousQueryInfoOuterClass.ChessRogueNousQueryInfo getRogueNous() {
      return rogueNous;
    }

    /**
     * <code>optional .ChessRogueNousQueryInfo rogue_nous = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChessRogueNousQueryInfoOuterClass.ChessRogueNousQueryInfo getMutableRogueNous() {
      bitField0_ |= 0x00000004;
      return rogueNous;
    }

    /**
     * <code>optional .ChessRogueNousQueryInfo rogue_nous = 10;</code>
     * @param value the rogueNous to set
     * @return this
     */
    public ChessRogueQueryScRsp setRogueNous(
        final ChessRogueNousQueryInfoOuterClass.ChessRogueNousQueryInfo value) {
      bitField0_ |= 0x00000004;
      rogueNous.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .ChessRogueCurrentInfo current_info = 12;</code>
     * @return whether the currentInfo field is set
     */
    public boolean hasCurrentInfo() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .ChessRogueCurrentInfo current_info = 12;</code>
     * @return this
     */
    public ChessRogueQueryScRsp clearCurrentInfo() {
      bitField0_ &= ~0x00000008;
      currentInfo.clear();
      return this;
    }

    /**
     * <code>optional .ChessRogueCurrentInfo current_info = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableCurrentInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChessRogueCurrentInfoOuterClass.ChessRogueCurrentInfo getCurrentInfo() {
      return currentInfo;
    }

    /**
     * <code>optional .ChessRogueCurrentInfo current_info = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChessRogueCurrentInfoOuterClass.ChessRogueCurrentInfo getMutableCurrentInfo() {
      bitField0_ |= 0x00000008;
      return currentInfo;
    }

    /**
     * <code>optional .ChessRogueCurrentInfo current_info = 12;</code>
     * @param value the currentInfo to set
     * @return this
     */
    public ChessRogueQueryScRsp setCurrentInfo(
        final ChessRogueCurrentInfoOuterClass.ChessRogueCurrentInfo value) {
      bitField0_ |= 0x00000008;
      currentInfo.copyFrom(value);
      return this;
    }

    @Override
    public ChessRogueQueryScRsp copyFrom(final ChessRogueQueryScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        nOGDNLNLMJH.copyFrom(other.nOGDNLNLMJH);
        rogueNous.copyFrom(other.rogueNous);
        currentInfo.copyFrom(other.currentInfo);
      }
      return this;
    }

    @Override
    public ChessRogueQueryScRsp mergeFrom(final ChessRogueQueryScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasNOGDNLNLMJH()) {
        getMutableNOGDNLNLMJH().mergeFrom(other.nOGDNLNLMJH);
      }
      if (other.hasRogueNous()) {
        getMutableRogueNous().mergeFrom(other.rogueNous);
      }
      if (other.hasCurrentInfo()) {
        getMutableCurrentInfo().mergeFrom(other.currentInfo);
      }
      return this;
    }

    @Override
    public ChessRogueQueryScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      nOGDNLNLMJH.clear();
      rogueNous.clear();
      currentInfo.clear();
      return this;
    }

    @Override
    public ChessRogueQueryScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      nOGDNLNLMJH.clearQuick();
      rogueNous.clearQuick();
      currentInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChessRogueQueryScRsp)) {
        return false;
      }
      ChessRogueQueryScRsp other = (ChessRogueQueryScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasNOGDNLNLMJH() || nOGDNLNLMJH.equals(other.nOGDNLNLMJH))
        && (!hasRogueNous() || rogueNous.equals(other.rogueNous))
        && (!hasCurrentInfo() || currentInfo.equals(other.currentInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 74);
        output.writeMessageNoTag(nOGDNLNLMJH);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 82);
        output.writeMessageNoTag(rogueNous);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 98);
        output.writeMessageNoTag(currentInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(nOGDNLNLMJH);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueNous);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(currentInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChessRogueQueryScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 74) {
              break;
            }
          }
          case 74: {
            // nOGDNLNLMJH
            input.readMessage(nOGDNLNLMJH);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 82) {
              break;
            }
          }
          case 82: {
            // rogueNous
            input.readMessage(rogueNous);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // currentInfo
            input.readMessage(currentInfo);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.nOGDNLNLMJH, nOGDNLNLMJH);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.rogueNous, rogueNous);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.currentInfo, currentInfo);
      }
      output.endObject();
    }

    @Override
    public ChessRogueQueryScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 459821233: {
            if (input.isAtField(FieldNames.nOGDNLNLMJH)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(nOGDNLNLMJH);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 655959321:
          case -1124433052: {
            if (input.isAtField(FieldNames.rogueNous)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueNous);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 600912327:
          case 1468588980: {
            if (input.isAtField(FieldNames.currentInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(currentInfo);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public ChessRogueQueryScRsp clone() {
      return new ChessRogueQueryScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChessRogueQueryScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChessRogueQueryScRsp(), data).checkInitialized();
    }

    public static ChessRogueQueryScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueQueryScRsp(), input).checkInitialized();
    }

    public static ChessRogueQueryScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueQueryScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChessRogueQueryScRsp messages
     */
    public static MessageFactory<ChessRogueQueryScRsp> getFactory() {
      return ChessRogueQueryScRspFactory.INSTANCE;
    }

    private enum ChessRogueQueryScRspFactory implements MessageFactory<ChessRogueQueryScRsp> {
      INSTANCE;

      @Override
      public ChessRogueQueryScRsp create() {
        return ChessRogueQueryScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName nOGDNLNLMJH = FieldName.forField("NOGDNLNLMJH");

      static final FieldName rogueNous = FieldName.forField("rogueNous", "rogue_nous");

      static final FieldName currentInfo = FieldName.forField("currentInfo", "current_info");
    }
  }
}
