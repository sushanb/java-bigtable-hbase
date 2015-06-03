// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/longrunning/operations.proto

package com.google.longrunning;

/**
 * Protobuf type {@code google.longrunning.ListOperationsResponse}
 *
 * <pre>
 * The response message for [Operations.ListOperations][google.longrunning.Operations.ListOperations].
 * </pre>
 */
public  final class ListOperationsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.longrunning.ListOperationsResponse)
    ListOperationsResponseOrBuilder {
  // Use ListOperationsResponse.newBuilder() to construct.
  private ListOperationsResponse(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private ListOperationsResponse() {
    operations_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ListOperationsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              operations_ = new java.util.ArrayList<com.google.longrunning.Operation>();
              mutable_bitField0_ |= 0x00000001;
            }
            operations_.add(input.readMessage(com.google.longrunning.Operation.PARSER, extensionRegistry));
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();

            nextPageToken_ = bs;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        operations_ = java.util.Collections.unmodifiableList(operations_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.longrunning.OperationsProto.internal_static_google_longrunning_ListOperationsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.longrunning.OperationsProto.internal_static_google_longrunning_ListOperationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.longrunning.ListOperationsResponse.class, com.google.longrunning.ListOperationsResponse.Builder.class);
  }

  public static final com.google.protobuf.Parser<ListOperationsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListOperationsResponse>() {
    public ListOperationsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListOperationsResponse(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<ListOperationsResponse> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int OPERATIONS_FIELD_NUMBER = 1;
  private java.util.List<com.google.longrunning.Operation> operations_;
  /**
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   *
   * <pre>
   * A list of operations that match the specified filter in the request.
   * </pre>
   */
  public java.util.List<com.google.longrunning.Operation> getOperationsList() {
    return operations_;
  }
  /**
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   *
   * <pre>
   * A list of operations that match the specified filter in the request.
   * </pre>
   */
  public java.util.List<? extends com.google.longrunning.OperationOrBuilder> 
      getOperationsOrBuilderList() {
    return operations_;
  }
  /**
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   *
   * <pre>
   * A list of operations that match the specified filter in the request.
   * </pre>
   */
  public int getOperationsCount() {
    return operations_.size();
  }
  /**
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   *
   * <pre>
   * A list of operations that match the specified filter in the request.
   * </pre>
   */
  public com.google.longrunning.Operation getOperations(int index) {
    return operations_.get(index);
  }
  /**
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   *
   * <pre>
   * A list of operations that match the specified filter in the request.
   * </pre>
   */
  public com.google.longrunning.OperationOrBuilder getOperationsOrBuilder(
      int index) {
    return operations_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private java.lang.Object nextPageToken_;
  /**
   * <code>optional string next_page_token = 2;</code>
   *
   * <pre>
   * The standard List next-page token.
   * </pre>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        nextPageToken_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string next_page_token = 2;</code>
   *
   * <pre>
   * The standard List next-page token.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    for (int i = 0; i < operations_.size(); i++) {
      output.writeMessage(1, operations_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      output.writeBytes(2, getNextPageTokenBytes());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < operations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, operations_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getNextPageTokenBytes());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.longrunning.ListOperationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.longrunning.ListOperationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.longrunning.ListOperationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.longrunning.ListOperationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.longrunning.ListOperationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.longrunning.ListOperationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.longrunning.ListOperationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.longrunning.ListOperationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.longrunning.ListOperationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.longrunning.ListOperationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return new Builder(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.google.longrunning.ListOperationsResponse prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.longrunning.ListOperationsResponse}
   *
   * <pre>
   * The response message for [Operations.ListOperations][google.longrunning.Operations.ListOperations].
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.longrunning.ListOperationsResponse)
      com.google.longrunning.ListOperationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.longrunning.OperationsProto.internal_static_google_longrunning_ListOperationsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.longrunning.OperationsProto.internal_static_google_longrunning_ListOperationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.longrunning.ListOperationsResponse.class, com.google.longrunning.ListOperationsResponse.Builder.class);
    }

    // Construct using com.google.longrunning.ListOperationsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        getOperationsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (operationsBuilder_ == null) {
        operations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        operationsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.longrunning.OperationsProto.internal_static_google_longrunning_ListOperationsResponse_descriptor;
    }

    public com.google.longrunning.ListOperationsResponse getDefaultInstanceForType() {
      return com.google.longrunning.ListOperationsResponse.getDefaultInstance();
    }

    public com.google.longrunning.ListOperationsResponse build() {
      com.google.longrunning.ListOperationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.longrunning.ListOperationsResponse buildPartial() {
      com.google.longrunning.ListOperationsResponse result = new com.google.longrunning.ListOperationsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (operationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          operations_ = java.util.Collections.unmodifiableList(operations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.operations_ = operations_;
      } else {
        result.operations_ = operationsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.longrunning.ListOperationsResponse) {
        return mergeFrom((com.google.longrunning.ListOperationsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.longrunning.ListOperationsResponse other) {
      if (other == com.google.longrunning.ListOperationsResponse.getDefaultInstance()) return this;
      if (operationsBuilder_ == null) {
        if (!other.operations_.isEmpty()) {
          if (operations_.isEmpty()) {
            operations_ = other.operations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOperationsIsMutable();
            operations_.addAll(other.operations_);
          }
          onChanged();
        }
      } else {
        if (!other.operations_.isEmpty()) {
          if (operationsBuilder_.isEmpty()) {
            operationsBuilder_.dispose();
            operationsBuilder_ = null;
            operations_ = other.operations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            operationsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getOperationsFieldBuilder() : null;
          } else {
            operationsBuilder_.addAllMessages(other.operations_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.longrunning.ListOperationsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.longrunning.ListOperationsResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.longrunning.Operation> operations_ =
      java.util.Collections.emptyList();
    private void ensureOperationsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        operations_ = new java.util.ArrayList<com.google.longrunning.Operation>(operations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.longrunning.Operation, com.google.longrunning.Operation.Builder, com.google.longrunning.OperationOrBuilder> operationsBuilder_;

    /**
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     *
     * <pre>
     * A list of operations that match the specified filter in the request.
     * </pre>
     */
    public java.util.List<com.google.longrunning.Operation> getOperationsList() {
      if (operationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(operations_);
      } else {
        return operationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     *
     * <pre>
     * A list of operations that match the specified filter in the request.
     * </pre>
     */
    public int getOperationsCount() {
      if (operationsBuilder_ == null) {
        return operations_.size();
      } else {
        return operationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     *
     * <pre>
     * A list of operations that match the specified filter in the request.
     * </pre>
     */
    public com.google.longrunning.Operation getOperations(int index) {
      if (operationsBuilder_ == null) {
        return operations_.get(index);
      } else {
        return operationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     *
     * <pre>
     * A list of operations that match the specified filter in the request.
     * </pre>
     */
    public Builder setOperations(
        int index, com.google.longrunning.Operation value) {
      if (operationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationsIsMutable();
        operations_.set(index, value);
        onChanged();
      } else {
        operationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     *
     * <pre>
     * A list of operations that match the specified filter in the request.
     * </pre>
     */
    public Builder setOperations(
        int index, com.google.longrunning.Operation.Builder builderForValue) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.set(index, builderForValue.build());
        onChanged();
      } else {
        operationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     *
     * <pre>
     * A list of operations that match the specified filter in the request.
     * </pre>
     */
    public Builder addOperations(com.google.longrunning.Operation value) {
      if (operationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationsIsMutable();
        operations_.add(value);
        onChanged();
      } else {
        operationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     *
     * <pre>
     * A list of operations that match the specified filter in the request.
     * </pre>
     */
    public Builder addOperations(
        int index, com.google.longrunning.Operation value) {
      if (operationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationsIsMutable();
        operations_.add(index, value);
        onChanged();
      } else {
        operationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     *
     * <pre>
     * A list of operations that match the specified filter in the request.
     * </pre>
     */
    public Builder addOperations(
        com.google.longrunning.Operation.Builder builderForValue) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.add(builderForValue.build());
        onChanged();
      } else {
        operationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     *
     * <pre>
     * A list of operations that match the specified filter in the request.
     * </pre>
     */
    public Builder addOperations(
        int index, com.google.longrunning.Operation.Builder builderForValue) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.add(index, builderForValue.build());
        onChanged();
      } else {
        operationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     *
     * <pre>
     * A list of operations that match the specified filter in the request.
     * </pre>
     */
    public Builder addAllOperations(
        java.lang.Iterable<? extends com.google.longrunning.Operation> values) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, operations_);
        onChanged();
      } else {
        operationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     *
     * <pre>
     * A list of operations that match the specified filter in the request.
     * </pre>
     */
    public Builder clearOperations() {
      if (operationsBuilder_ == null) {
        operations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        operationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     *
     * <pre>
     * A list of operations that match the specified filter in the request.
     * </pre>
     */
    public Builder removeOperations(int index) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.remove(index);
        onChanged();
      } else {
        operationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     *
     * <pre>
     * A list of operations that match the specified filter in the request.
     * </pre>
     */
    public com.google.longrunning.Operation.Builder getOperationsBuilder(
        int index) {
      return getOperationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     *
     * <pre>
     * A list of operations that match the specified filter in the request.
     * </pre>
     */
    public com.google.longrunning.OperationOrBuilder getOperationsOrBuilder(
        int index) {
      if (operationsBuilder_ == null) {
        return operations_.get(index);  } else {
        return operationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     *
     * <pre>
     * A list of operations that match the specified filter in the request.
     * </pre>
     */
    public java.util.List<? extends com.google.longrunning.OperationOrBuilder> 
         getOperationsOrBuilderList() {
      if (operationsBuilder_ != null) {
        return operationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(operations_);
      }
    }
    /**
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     *
     * <pre>
     * A list of operations that match the specified filter in the request.
     * </pre>
     */
    public com.google.longrunning.Operation.Builder addOperationsBuilder() {
      return getOperationsFieldBuilder().addBuilder(
          com.google.longrunning.Operation.getDefaultInstance());
    }
    /**
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     *
     * <pre>
     * A list of operations that match the specified filter in the request.
     * </pre>
     */
    public com.google.longrunning.Operation.Builder addOperationsBuilder(
        int index) {
      return getOperationsFieldBuilder().addBuilder(
          index, com.google.longrunning.Operation.getDefaultInstance());
    }
    /**
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     *
     * <pre>
     * A list of operations that match the specified filter in the request.
     * </pre>
     */
    public java.util.List<com.google.longrunning.Operation.Builder> 
         getOperationsBuilderList() {
      return getOperationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.longrunning.Operation, com.google.longrunning.Operation.Builder, com.google.longrunning.OperationOrBuilder> 
        getOperationsFieldBuilder() {
      if (operationsBuilder_ == null) {
        operationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.google.longrunning.Operation, com.google.longrunning.Operation.Builder, com.google.longrunning.OperationOrBuilder>(
                operations_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        operations_ = null;
      }
      return operationsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <code>optional string next_page_token = 2;</code>
     *
     * <pre>
     * The standard List next-page token.
     * </pre>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          nextPageToken_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string next_page_token = 2;</code>
     *
     * <pre>
     * The standard List next-page token.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string next_page_token = 2;</code>
     *
     * <pre>
     * The standard List next-page token.
     * </pre>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string next_page_token = 2;</code>
     *
     * <pre>
     * The standard List next-page token.
     * </pre>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <code>optional string next_page_token = 2;</code>
     *
     * <pre>
     * The standard List next-page token.
     * </pre>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.longrunning.ListOperationsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.longrunning.ListOperationsResponse)
  private static final com.google.longrunning.ListOperationsResponse defaultInstance;static {
    defaultInstance = new com.google.longrunning.ListOperationsResponse();
  }

  public static com.google.longrunning.ListOperationsResponse getDefaultInstance() {
    return defaultInstance;
  }

  public com.google.longrunning.ListOperationsResponse getDefaultInstanceForType() {
    return defaultInstance;
  }

}

