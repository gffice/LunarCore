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

public final class CommonRogueUpdateScNotifyOuterClass {
  /**
   * Protobuf type {@code CommonRogueUpdateScNotify}
   */
  public static final class CommonRogueUpdateScNotify extends ProtoMessage<CommonRogueUpdateScNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     * CJFJFKJICGK NALLCHLAJPN = 10;
     * </pre>
     *
     * <code>optional .RogueUpdate rogue_update = 15;</code>
     */
    private final RogueUpdateOuterClass.RogueUpdate rogueUpdate = RogueUpdateOuterClass.RogueUpdate.newInstance();

    private CommonRogueUpdateScNotify() {
    }

    /**
     * @return a new empty instance of {@code CommonRogueUpdateScNotify}
     */
    public static CommonRogueUpdateScNotify newInstance() {
      return new CommonRogueUpdateScNotify();
    }

    /**
     * <pre>
     * CJFJFKJICGK NALLCHLAJPN = 10;
     * </pre>
     *
     * <code>optional .RogueUpdate rogue_update = 15;</code>
     * @return whether the rogueUpdate field is set
     */
    public boolean hasRogueUpdate() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * CJFJFKJICGK NALLCHLAJPN = 10;
     * </pre>
     *
     * <code>optional .RogueUpdate rogue_update = 15;</code>
     * @return this
     */
    public CommonRogueUpdateScNotify clearRogueUpdate() {
      bitField0_ &= ~0x00000001;
      rogueUpdate.clear();
      return this;
    }

    /**
     * <pre>
     * CJFJFKJICGK NALLCHLAJPN = 10;
     * </pre>
     *
     * <code>optional .RogueUpdate rogue_update = 15;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueUpdate()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueUpdateOuterClass.RogueUpdate getRogueUpdate() {
      return rogueUpdate;
    }

    /**
     * <pre>
     * CJFJFKJICGK NALLCHLAJPN = 10;
     * </pre>
     *
     * <code>optional .RogueUpdate rogue_update = 15;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueUpdateOuterClass.RogueUpdate getMutableRogueUpdate() {
      bitField0_ |= 0x00000001;
      return rogueUpdate;
    }

    /**
     * <pre>
     * CJFJFKJICGK NALLCHLAJPN = 10;
     * </pre>
     *
     * <code>optional .RogueUpdate rogue_update = 15;</code>
     * @param value the rogueUpdate to set
     * @return this
     */
    public CommonRogueUpdateScNotify setRogueUpdate(final RogueUpdateOuterClass.RogueUpdate value) {
      bitField0_ |= 0x00000001;
      rogueUpdate.copyFrom(value);
      return this;
    }

    @Override
    public CommonRogueUpdateScNotify copyFrom(final CommonRogueUpdateScNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        rogueUpdate.copyFrom(other.rogueUpdate);
      }
      return this;
    }

    @Override
    public CommonRogueUpdateScNotify mergeFrom(final CommonRogueUpdateScNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRogueUpdate()) {
        getMutableRogueUpdate().mergeFrom(other.rogueUpdate);
      }
      return this;
    }

    @Override
    public CommonRogueUpdateScNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueUpdate.clear();
      return this;
    }

    @Override
    public CommonRogueUpdateScNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueUpdate.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof CommonRogueUpdateScNotify)) {
        return false;
      }
      CommonRogueUpdateScNotify other = (CommonRogueUpdateScNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasRogueUpdate() || rogueUpdate.equals(other.rogueUpdate));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 122);
        output.writeMessageNoTag(rogueUpdate);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueUpdate);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public CommonRogueUpdateScNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 122: {
            // rogueUpdate
            input.readMessage(rogueUpdate);
            bitField0_ |= 0x00000001;
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
        output.writeMessage(FieldNames.rogueUpdate, rogueUpdate);
      }
      output.endObject();
    }

    @Override
    public CommonRogueUpdateScNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -782477501:
          case 1952403150: {
            if (input.isAtField(FieldNames.rogueUpdate)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueUpdate);
                bitField0_ |= 0x00000001;
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
    public CommonRogueUpdateScNotify clone() {
      return new CommonRogueUpdateScNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static CommonRogueUpdateScNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new CommonRogueUpdateScNotify(), data).checkInitialized();
    }

    public static CommonRogueUpdateScNotify parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new CommonRogueUpdateScNotify(), input).checkInitialized();
    }

    public static CommonRogueUpdateScNotify parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new CommonRogueUpdateScNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating CommonRogueUpdateScNotify messages
     */
    public static MessageFactory<CommonRogueUpdateScNotify> getFactory() {
      return CommonRogueUpdateScNotifyFactory.INSTANCE;
    }

    private enum CommonRogueUpdateScNotifyFactory implements MessageFactory<CommonRogueUpdateScNotify> {
      INSTANCE;

      @Override
      public CommonRogueUpdateScNotify create() {
        return CommonRogueUpdateScNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName rogueUpdate = FieldName.forField("rogueUpdate", "rogue_update");
    }
  }
}
