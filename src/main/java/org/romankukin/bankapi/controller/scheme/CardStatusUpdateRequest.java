package org.romankukin.bankapi.controller.scheme;

import org.romankukin.bankapi.model.CardStatus;

public class CardStatusUpdateRequest {

  private String number;
  private int status;

  private void checkStatus(int status) {
    if (status < 1 || status > CardStatus.values().length) {
      throw new IndexOutOfBoundsException("bad card status is out of bounds: " + status);
    }
  }

  public CardStatusUpdateRequest(CardUpdateRequest cardUpdate, int status) {
    checkStatus(status);
    this.number = cardUpdate.getNumber();
    this.status = status;
  }

  public CardStatusUpdateRequest() {
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    checkStatus(status);
    this.status = status;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }
}
