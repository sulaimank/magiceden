package magicEden.json;

import com.google.gson.annotations.SerializedName;

public enum AccountType {
    @SerializedName("mint")
    MINT,
    @SerializedName("metadata")
    META_DATA,
    @SerializedName("masterEdition")
    MASTER_EDITION,
    @SerializedName("auction")
    AUCTION,
    @SerializedName("auctionData")
    AUCTION_DATA,
    @SerializedName("account")
    ACCOUNT,
    @SerializedName("escrow")
    ESCROW
}
