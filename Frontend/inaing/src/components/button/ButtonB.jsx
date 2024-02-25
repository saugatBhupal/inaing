import React from 'react'
import styled from 'styled-components'

const Button = styled.button`
  padding : 12px 30px;
  width : inherit;
  background-color : #0f2c56;
  color : #ffffff;
  border : 1px solid #0f2c56;
  font-size : 16px;
  cursor: pointer;
  transition-duration : 0.2s;
  &&:hover{
    color : #0f2c56;
    background-color : #ffffff;
  }
`
function ButtonB({text}) {
  return (
    <Button>{text}</Button>
  )
}

export default ButtonB