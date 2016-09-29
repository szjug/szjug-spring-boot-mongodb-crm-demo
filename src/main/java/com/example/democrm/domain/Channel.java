package com.example.democrm.domain;

import org.springframework.data.annotation.Id;

/**
 * This table is to have recommended predefined values
 * @author Paul
 */
public @lombok.Data class Channel {
	@Id private String id;
	private Organization organization; // shard key
	private ChannelType channelType;
	private String name;
}
