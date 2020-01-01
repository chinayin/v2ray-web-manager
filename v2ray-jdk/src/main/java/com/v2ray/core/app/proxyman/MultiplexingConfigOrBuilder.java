// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/proxyman/config.proto

package com.v2ray.core.app.proxyman;

public interface MultiplexingConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.app.proxyman.MultiplexingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether or not Mux is enabled.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   */
  boolean getEnabled();

  /**
   * <pre>
   * Max number of concurrent connections that one Mux connection can handle.
   * </pre>
   *
   * <code>uint32 concurrency = 2;</code>
   */
  int getConcurrency();
}