package com.simundi.scalatour.level.a1.infix

class Calculator(var currentValue: Double) {

  def this() = this(0.0)

  def +(value: Integer):Calculator = {
    currentValue += value
    this
  }
  def -(value: Integer):Calculator = {
    currentValue -= value
    this
  }
  def *(value: Integer):Calculator = {
    currentValue *= value
    this
  }
}