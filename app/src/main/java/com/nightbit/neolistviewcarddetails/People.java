package com.nightbit.neolistviewcarddetails;


class People {
    private String mFirstname;
    private String mLastname;
    private String mSubject;
    private String mSong;

    public People(String mFirstname, String mLastname, String mSubject, String mSong) {
        this.mFirstname = mFirstname;
        this.mLastname = mLastname;
        this.mSubject = mSubject;
        this.mSong = mSong;
    }

    public String getmFirstname() {
        return mFirstname;
    }

    public void setmFirstname(String mFirstname) {
        this.mFirstname = mFirstname;
    }

    public String getmLastname() {
        return mLastname;
    }

    public void setmLastname(String mLastname) {
        this.mLastname = mLastname;
    }

    public String getmSubject() {
        return mSubject;
    }

    public void setmSubject(String mSubject) {
        this.mSubject = mSubject;
    }

    public String getmSong() {
        return mSong;
    }

    public void setmSong(String mSong) {
        this.mSong = mSong;
    }

    @Override
    public String toString() {
        return "People{" +
                "mFirstname='" + mFirstname + '\'' +
                ", mLastname='" + mLastname + '\'' +
                ", mSubject='" + mSubject + '\'' +
                ", mSong='" + mSong + '\'' +
                '}';
    }
}
