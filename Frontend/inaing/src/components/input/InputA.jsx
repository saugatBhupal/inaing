import React from 'react'
import styled from 'styled-components'

const Input = styled.input`
    width : 100%;
    font-size : 16px;
    padding : 2px 0;
    border : none;
    border-bottom : 1px solid #15325b;
    color : #15325bce;
    &:focus{
        outline : none;
    }
`
function InputA({placeholder}) {
  return (
    <Input placeholder={placeholder}></Input>
  )
}

export default InputA