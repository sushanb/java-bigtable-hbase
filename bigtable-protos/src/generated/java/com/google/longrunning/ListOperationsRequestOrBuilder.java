// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/longrunning/operations.proto

package com.google.longrunning;

public interface ListOperationsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.longrunning.ListOperationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 4;</code>
   *
   * <pre>
   * The name of the operation collection.
   * </pre>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 4;</code>
   *
   * <pre>
   * The name of the operation collection.
   * </pre>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string filter = 1;</code>
   *
   * <pre>
   * The standard List filter.
   * </pre>
   */
  java.lang.String getFilter();
  /**
   * <code>optional string filter = 1;</code>
   *
   * <pre>
   * The standard List filter.
   * </pre>
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <code>optional int32 page_size = 2;</code>
   *
   * <pre>
   * The standard List page size.
   * </pre>
   */
  int getPageSize();

  /**
   * <code>optional string page_token = 3;</code>
   *
   * <pre>
   * The standard List page token.
   * </pre>
   */
  java.lang.String getPageToken();
  /**
   * <code>optional string page_token = 3;</code>
   *
   * <pre>
   * The standard List page token.
   * </pre>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}