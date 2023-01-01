/*
 * Copyright (C) 2018 Velocity Contributors
 *
 * The Velocity API is licensed under the terms of the MIT License. For more details,
 * reference the LICENSE file in the api top-level directory.
 */

package com.velocitypowered.api.event.proxy;

import com.google.common.base.Preconditions;
import com.velocitypowered.api.network.ListenerType;
import java.net.InetSocketAddress;

/**
 * This event is fired by the proxy after a listener starts accepting connections.
 */
public final class ListenerPreBoundEvent {

  private InetSocketAddress address;
  private final ListenerType listenerType;

  public ListenerPreBoundEvent(InetSocketAddress address, ListenerType listenerType) {
    this.address = Preconditions.checkNotNull(address, "address");
    this.listenerType = Preconditions.checkNotNull(listenerType, "listenerType");
  }

  public InetSocketAddress getAddress() {
    return address;
  }
  
  public void setAddress(InetSocketAddress address) {
    this.address = address;
  }

  public ListenerType getListenerType() {
    return listenerType;
  }

  @Override
  public String toString() {
    return "ListenerPreBoundEvent{"
        + "address=" + address
        + ", listenerType=" + listenerType
        + '}';
  }
}
