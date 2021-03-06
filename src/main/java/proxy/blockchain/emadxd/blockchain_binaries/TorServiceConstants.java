/* Copyright (c) 2009, Nathan Freitas, Orbot / The Guardian Project - http://openideals.com/guardian */
/* See LICENSE for licensing information */

package proxy.blockchain.emadxd.blockchain_binaries;

public interface TorServiceConstants {

    String TAG = "TorBinary";
	//name of the tor C binary
	String TOR_ASSET_KEY = "lib_emadxd_blockchain";
	
	//blockchain_config (tor config file)
	String TORRC_ASSET_KEY = "blockchain_config";

	String COMMON_ASSET_KEY = "common/";

	//geoip data file asset key
	String GEOIP_ASSET_KEY = "geoip";
	String GEOIP6_ASSET_KEY = "geoip6";

	int FILE_WRITE_BUFFER_SIZE = 1024;

    String BINARY_TOR_VERSION = "0.4.1.5-openssl1.0.2p";

}