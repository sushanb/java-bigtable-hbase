// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v1approved/bigtable_data.proto

package com.google.bigtable.v1;

public interface RowRangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v1.RowRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bytes start_key = 2;</code>
   *
   * <pre>
   * Inclusive lower bound. If left empty, interpreted as the empty string.
   * </pre>
   */
  com.google.protobuf.ByteString getStartKey();

  /**
   * <code>optional bytes end_key = 3;</code>
   *
   * <pre>
   * Exclusive upper bound. If left empty, interpreted as infinity.
   * </pre>
   */
  com.google.protobuf.ByteString getEndKey();
}
