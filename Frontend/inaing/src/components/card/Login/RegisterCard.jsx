import React from 'react'
import styled from 'styled-components'
import InputA from '../../input/InputA'
import ButtonB from '../../button/ButtonB'
import ButtonA from '../../button/ButtonA'

const Wrapper = styled.div`
    max-width : 400px;
    background-color : #f7f7f7;
    padding : 40px;
    a{
        width : fit-content;
        margin : 20px auto;
        color : #0f2c56;
    }
    input{
        margin : 20px auto;
        background-color : transparent;
    }
    button{
        width : 100%;
        margin : 20px auto;
        background-color : transparent;
    }
`
export default function RegisterCard() {
  return (
    <Wrapper>
        <InputA placeholder={"First Name*"}/>
        <InputA placeholder={"Last Name*"}/>
        <InputA placeholder={"E-Mail*"}/>
        <InputA placeholder={"Password*"} type ={"password"}/>
        <ButtonA text={"Submit"}/>
        <a href="/login">Login
        </a>
    </Wrapper>
  )
}
