// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package dk.via.nbnp.databaseserver.protobuf;

/**
 * Protobuf type {@code Message}
 */
public final class Message extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Message)
    MessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Message.newBuilder() to construct.
  private Message(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Message() {
    content_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Message();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Message(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            id_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            content_ = s;
            break;
          }
          case 26: {
            dk.via.nbnp.databaseserver.protobuf.User.Builder subBuilder = null;
            if (sender_ != null) {
              subBuilder = sender_.toBuilder();
            }
            sender_ = input.readMessage(dk.via.nbnp.databaseserver.protobuf.User.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(sender_);
              sender_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            conversationId_ = input.readInt64();
            break;
          }
          case 42: {
            dk.via.nbnp.databaseserver.protobuf.LocalDateTime.Builder subBuilder = null;
            if (dateTimeSent_ != null) {
              subBuilder = dateTimeSent_.toBuilder();
            }
            dateTimeSent_ = input.readMessage(dk.via.nbnp.databaseserver.protobuf.LocalDateTime.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dateTimeSent_);
              dateTimeSent_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return dk.via.nbnp.databaseserver.protobuf.MessageOuterClass.internal_static_Message_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return dk.via.nbnp.databaseserver.protobuf.MessageOuterClass.internal_static_Message_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            dk.via.nbnp.databaseserver.protobuf.Message.class, dk.via.nbnp.databaseserver.protobuf.Message.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int CONTENT_FIELD_NUMBER = 2;
  private volatile java.lang.Object content_;
  /**
   * <code>string content = 2;</code>
   * @return The content.
   */
  @java.lang.Override
  public java.lang.String getContent() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      content_ = s;
      return s;
    }
  }
  /**
   * <code>string content = 2;</code>
   * @return The bytes for content.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContentBytes() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      content_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SENDER_FIELD_NUMBER = 3;
  private dk.via.nbnp.databaseserver.protobuf.User sender_;
  /**
   * <code>.User sender = 3;</code>
   * @return Whether the sender field is set.
   */
  @java.lang.Override
  public boolean hasSender() {
    return sender_ != null;
  }
  /**
   * <code>.User sender = 3;</code>
   * @return The sender.
   */
  @java.lang.Override
  public dk.via.nbnp.databaseserver.protobuf.User getSender() {
    return sender_ == null ? dk.via.nbnp.databaseserver.protobuf.User.getDefaultInstance() : sender_;
  }
  /**
   * <code>.User sender = 3;</code>
   */
  @java.lang.Override
  public dk.via.nbnp.databaseserver.protobuf.UserOrBuilder getSenderOrBuilder() {
    return getSender();
  }

  public static final int CONVERSATIONID_FIELD_NUMBER = 4;
  private long conversationId_;
  /**
   * <code>int64 conversationId = 4;</code>
   * @return The conversationId.
   */
  @java.lang.Override
  public long getConversationId() {
    return conversationId_;
  }

  public static final int DATETIMESENT_FIELD_NUMBER = 5;
  private dk.via.nbnp.databaseserver.protobuf.LocalDateTime dateTimeSent_;
  /**
   * <code>.LocalDateTime dateTimeSent = 5;</code>
   * @return Whether the dateTimeSent field is set.
   */
  @java.lang.Override
  public boolean hasDateTimeSent() {
    return dateTimeSent_ != null;
  }
  /**
   * <code>.LocalDateTime dateTimeSent = 5;</code>
   * @return The dateTimeSent.
   */
  @java.lang.Override
  public dk.via.nbnp.databaseserver.protobuf.LocalDateTime getDateTimeSent() {
    return dateTimeSent_ == null ? dk.via.nbnp.databaseserver.protobuf.LocalDateTime.getDefaultInstance() : dateTimeSent_;
  }
  /**
   * <code>.LocalDateTime dateTimeSent = 5;</code>
   */
  @java.lang.Override
  public dk.via.nbnp.databaseserver.protobuf.LocalDateTimeOrBuilder getDateTimeSentOrBuilder() {
    return getDateTimeSent();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, content_);
    }
    if (sender_ != null) {
      output.writeMessage(3, getSender());
    }
    if (conversationId_ != 0L) {
      output.writeInt64(4, conversationId_);
    }
    if (dateTimeSent_ != null) {
      output.writeMessage(5, getDateTimeSent());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, content_);
    }
    if (sender_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSender());
    }
    if (conversationId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, conversationId_);
    }
    if (dateTimeSent_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getDateTimeSent());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof dk.via.nbnp.databaseserver.protobuf.Message)) {
      return super.equals(obj);
    }
    dk.via.nbnp.databaseserver.protobuf.Message other = (dk.via.nbnp.databaseserver.protobuf.Message) obj;

    if (getId()
        != other.getId()) return false;
    if (!getContent()
        .equals(other.getContent())) return false;
    if (hasSender() != other.hasSender()) return false;
    if (hasSender()) {
      if (!getSender()
          .equals(other.getSender())) return false;
    }
    if (getConversationId()
        != other.getConversationId()) return false;
    if (hasDateTimeSent() != other.hasDateTimeSent()) return false;
    if (hasDateTimeSent()) {
      if (!getDateTimeSent()
          .equals(other.getDateTimeSent())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    if (hasSender()) {
      hash = (37 * hash) + SENDER_FIELD_NUMBER;
      hash = (53 * hash) + getSender().hashCode();
    }
    hash = (37 * hash) + CONVERSATIONID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getConversationId());
    if (hasDateTimeSent()) {
      hash = (37 * hash) + DATETIMESENT_FIELD_NUMBER;
      hash = (53 * hash) + getDateTimeSent().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static dk.via.nbnp.databaseserver.protobuf.Message parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dk.via.nbnp.databaseserver.protobuf.Message parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dk.via.nbnp.databaseserver.protobuf.Message parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dk.via.nbnp.databaseserver.protobuf.Message parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dk.via.nbnp.databaseserver.protobuf.Message parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dk.via.nbnp.databaseserver.protobuf.Message parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dk.via.nbnp.databaseserver.protobuf.Message parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dk.via.nbnp.databaseserver.protobuf.Message parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static dk.via.nbnp.databaseserver.protobuf.Message parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static dk.via.nbnp.databaseserver.protobuf.Message parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static dk.via.nbnp.databaseserver.protobuf.Message parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dk.via.nbnp.databaseserver.protobuf.Message parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(dk.via.nbnp.databaseserver.protobuf.Message prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Message}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Message)
      dk.via.nbnp.databaseserver.protobuf.MessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dk.via.nbnp.databaseserver.protobuf.MessageOuterClass.internal_static_Message_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dk.via.nbnp.databaseserver.protobuf.MessageOuterClass.internal_static_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dk.via.nbnp.databaseserver.protobuf.Message.class, dk.via.nbnp.databaseserver.protobuf.Message.Builder.class);
    }

    // Construct using dk.via.nbnp.databaseserver.protobuf.Message.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0L;

      content_ = "";

      if (senderBuilder_ == null) {
        sender_ = null;
      } else {
        sender_ = null;
        senderBuilder_ = null;
      }
      conversationId_ = 0L;

      if (dateTimeSentBuilder_ == null) {
        dateTimeSent_ = null;
      } else {
        dateTimeSent_ = null;
        dateTimeSentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return dk.via.nbnp.databaseserver.protobuf.MessageOuterClass.internal_static_Message_descriptor;
    }

    @java.lang.Override
    public dk.via.nbnp.databaseserver.protobuf.Message getDefaultInstanceForType() {
      return dk.via.nbnp.databaseserver.protobuf.Message.getDefaultInstance();
    }

    @java.lang.Override
    public dk.via.nbnp.databaseserver.protobuf.Message build() {
      dk.via.nbnp.databaseserver.protobuf.Message result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public dk.via.nbnp.databaseserver.protobuf.Message buildPartial() {
      dk.via.nbnp.databaseserver.protobuf.Message result = new dk.via.nbnp.databaseserver.protobuf.Message(this);
      result.id_ = id_;
      result.content_ = content_;
      if (senderBuilder_ == null) {
        result.sender_ = sender_;
      } else {
        result.sender_ = senderBuilder_.build();
      }
      result.conversationId_ = conversationId_;
      if (dateTimeSentBuilder_ == null) {
        result.dateTimeSent_ = dateTimeSent_;
      } else {
        result.dateTimeSent_ = dateTimeSentBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof dk.via.nbnp.databaseserver.protobuf.Message) {
        return mergeFrom((dk.via.nbnp.databaseserver.protobuf.Message)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(dk.via.nbnp.databaseserver.protobuf.Message other) {
      if (other == dk.via.nbnp.databaseserver.protobuf.Message.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getContent().isEmpty()) {
        content_ = other.content_;
        onChanged();
      }
      if (other.hasSender()) {
        mergeSender(other.getSender());
      }
      if (other.getConversationId() != 0L) {
        setConversationId(other.getConversationId());
      }
      if (other.hasDateTimeSent()) {
        mergeDateTimeSent(other.getDateTimeSent());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      dk.via.nbnp.databaseserver.protobuf.Message parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (dk.via.nbnp.databaseserver.protobuf.Message) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long id_ ;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object content_ = "";
    /**
     * <code>string content = 2;</code>
     * @return The content.
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string content = 2;</code>
     * @return The bytes for content.
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string content = 2;</code>
     * @param value The content to set.
     * @return This builder for chaining.
     */
    public Builder setContent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      content_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string content = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearContent() {
      
      content_ = getDefaultInstance().getContent();
      onChanged();
      return this;
    }
    /**
     * <code>string content = 2;</code>
     * @param value The bytes for content to set.
     * @return This builder for chaining.
     */
    public Builder setContentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      content_ = value;
      onChanged();
      return this;
    }

    private dk.via.nbnp.databaseserver.protobuf.User sender_;
    private com.google.protobuf.SingleFieldBuilderV3<
        dk.via.nbnp.databaseserver.protobuf.User, dk.via.nbnp.databaseserver.protobuf.User.Builder, dk.via.nbnp.databaseserver.protobuf.UserOrBuilder> senderBuilder_;
    /**
     * <code>.User sender = 3;</code>
     * @return Whether the sender field is set.
     */
    public boolean hasSender() {
      return senderBuilder_ != null || sender_ != null;
    }
    /**
     * <code>.User sender = 3;</code>
     * @return The sender.
     */
    public dk.via.nbnp.databaseserver.protobuf.User getSender() {
      if (senderBuilder_ == null) {
        return sender_ == null ? dk.via.nbnp.databaseserver.protobuf.User.getDefaultInstance() : sender_;
      } else {
        return senderBuilder_.getMessage();
      }
    }
    /**
     * <code>.User sender = 3;</code>
     */
    public Builder setSender(dk.via.nbnp.databaseserver.protobuf.User value) {
      if (senderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sender_ = value;
        onChanged();
      } else {
        senderBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.User sender = 3;</code>
     */
    public Builder setSender(
        dk.via.nbnp.databaseserver.protobuf.User.Builder builderForValue) {
      if (senderBuilder_ == null) {
        sender_ = builderForValue.build();
        onChanged();
      } else {
        senderBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.User sender = 3;</code>
     */
    public Builder mergeSender(dk.via.nbnp.databaseserver.protobuf.User value) {
      if (senderBuilder_ == null) {
        if (sender_ != null) {
          sender_ =
            dk.via.nbnp.databaseserver.protobuf.User.newBuilder(sender_).mergeFrom(value).buildPartial();
        } else {
          sender_ = value;
        }
        onChanged();
      } else {
        senderBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.User sender = 3;</code>
     */
    public Builder clearSender() {
      if (senderBuilder_ == null) {
        sender_ = null;
        onChanged();
      } else {
        sender_ = null;
        senderBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.User sender = 3;</code>
     */
    public dk.via.nbnp.databaseserver.protobuf.User.Builder getSenderBuilder() {
      
      onChanged();
      return getSenderFieldBuilder().getBuilder();
    }
    /**
     * <code>.User sender = 3;</code>
     */
    public dk.via.nbnp.databaseserver.protobuf.UserOrBuilder getSenderOrBuilder() {
      if (senderBuilder_ != null) {
        return senderBuilder_.getMessageOrBuilder();
      } else {
        return sender_ == null ?
            dk.via.nbnp.databaseserver.protobuf.User.getDefaultInstance() : sender_;
      }
    }
    /**
     * <code>.User sender = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        dk.via.nbnp.databaseserver.protobuf.User, dk.via.nbnp.databaseserver.protobuf.User.Builder, dk.via.nbnp.databaseserver.protobuf.UserOrBuilder> 
        getSenderFieldBuilder() {
      if (senderBuilder_ == null) {
        senderBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            dk.via.nbnp.databaseserver.protobuf.User, dk.via.nbnp.databaseserver.protobuf.User.Builder, dk.via.nbnp.databaseserver.protobuf.UserOrBuilder>(
                getSender(),
                getParentForChildren(),
                isClean());
        sender_ = null;
      }
      return senderBuilder_;
    }

    private long conversationId_ ;
    /**
     * <code>int64 conversationId = 4;</code>
     * @return The conversationId.
     */
    @java.lang.Override
    public long getConversationId() {
      return conversationId_;
    }
    /**
     * <code>int64 conversationId = 4;</code>
     * @param value The conversationId to set.
     * @return This builder for chaining.
     */
    public Builder setConversationId(long value) {
      
      conversationId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 conversationId = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearConversationId() {
      
      conversationId_ = 0L;
      onChanged();
      return this;
    }

    private dk.via.nbnp.databaseserver.protobuf.LocalDateTime dateTimeSent_;
    private com.google.protobuf.SingleFieldBuilderV3<
        dk.via.nbnp.databaseserver.protobuf.LocalDateTime, dk.via.nbnp.databaseserver.protobuf.LocalDateTime.Builder, dk.via.nbnp.databaseserver.protobuf.LocalDateTimeOrBuilder> dateTimeSentBuilder_;
    /**
     * <code>.LocalDateTime dateTimeSent = 5;</code>
     * @return Whether the dateTimeSent field is set.
     */
    public boolean hasDateTimeSent() {
      return dateTimeSentBuilder_ != null || dateTimeSent_ != null;
    }
    /**
     * <code>.LocalDateTime dateTimeSent = 5;</code>
     * @return The dateTimeSent.
     */
    public dk.via.nbnp.databaseserver.protobuf.LocalDateTime getDateTimeSent() {
      if (dateTimeSentBuilder_ == null) {
        return dateTimeSent_ == null ? dk.via.nbnp.databaseserver.protobuf.LocalDateTime.getDefaultInstance() : dateTimeSent_;
      } else {
        return dateTimeSentBuilder_.getMessage();
      }
    }
    /**
     * <code>.LocalDateTime dateTimeSent = 5;</code>
     */
    public Builder setDateTimeSent(dk.via.nbnp.databaseserver.protobuf.LocalDateTime value) {
      if (dateTimeSentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dateTimeSent_ = value;
        onChanged();
      } else {
        dateTimeSentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.LocalDateTime dateTimeSent = 5;</code>
     */
    public Builder setDateTimeSent(
        dk.via.nbnp.databaseserver.protobuf.LocalDateTime.Builder builderForValue) {
      if (dateTimeSentBuilder_ == null) {
        dateTimeSent_ = builderForValue.build();
        onChanged();
      } else {
        dateTimeSentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.LocalDateTime dateTimeSent = 5;</code>
     */
    public Builder mergeDateTimeSent(dk.via.nbnp.databaseserver.protobuf.LocalDateTime value) {
      if (dateTimeSentBuilder_ == null) {
        if (dateTimeSent_ != null) {
          dateTimeSent_ =
            dk.via.nbnp.databaseserver.protobuf.LocalDateTime.newBuilder(dateTimeSent_).mergeFrom(value).buildPartial();
        } else {
          dateTimeSent_ = value;
        }
        onChanged();
      } else {
        dateTimeSentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.LocalDateTime dateTimeSent = 5;</code>
     */
    public Builder clearDateTimeSent() {
      if (dateTimeSentBuilder_ == null) {
        dateTimeSent_ = null;
        onChanged();
      } else {
        dateTimeSent_ = null;
        dateTimeSentBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.LocalDateTime dateTimeSent = 5;</code>
     */
    public dk.via.nbnp.databaseserver.protobuf.LocalDateTime.Builder getDateTimeSentBuilder() {
      
      onChanged();
      return getDateTimeSentFieldBuilder().getBuilder();
    }
    /**
     * <code>.LocalDateTime dateTimeSent = 5;</code>
     */
    public dk.via.nbnp.databaseserver.protobuf.LocalDateTimeOrBuilder getDateTimeSentOrBuilder() {
      if (dateTimeSentBuilder_ != null) {
        return dateTimeSentBuilder_.getMessageOrBuilder();
      } else {
        return dateTimeSent_ == null ?
            dk.via.nbnp.databaseserver.protobuf.LocalDateTime.getDefaultInstance() : dateTimeSent_;
      }
    }
    /**
     * <code>.LocalDateTime dateTimeSent = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        dk.via.nbnp.databaseserver.protobuf.LocalDateTime, dk.via.nbnp.databaseserver.protobuf.LocalDateTime.Builder, dk.via.nbnp.databaseserver.protobuf.LocalDateTimeOrBuilder> 
        getDateTimeSentFieldBuilder() {
      if (dateTimeSentBuilder_ == null) {
        dateTimeSentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            dk.via.nbnp.databaseserver.protobuf.LocalDateTime, dk.via.nbnp.databaseserver.protobuf.LocalDateTime.Builder, dk.via.nbnp.databaseserver.protobuf.LocalDateTimeOrBuilder>(
                getDateTimeSent(),
                getParentForChildren(),
                isClean());
        dateTimeSent_ = null;
      }
      return dateTimeSentBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Message)
  }

  // @@protoc_insertion_point(class_scope:Message)
  private static final dk.via.nbnp.databaseserver.protobuf.Message DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new dk.via.nbnp.databaseserver.protobuf.Message();
  }

  public static dk.via.nbnp.databaseserver.protobuf.Message getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Message>
      PARSER = new com.google.protobuf.AbstractParser<Message>() {
    @java.lang.Override
    public Message parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Message(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Message> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Message> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public dk.via.nbnp.databaseserver.protobuf.Message getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
