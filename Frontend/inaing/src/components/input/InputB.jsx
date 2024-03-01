import React from 'react'
import styled from 'styled-components'

const Wrapper = styled.div`
    color: #212737;
    font-size : 14px;
    input{
        border : solid 1px #21273720;
        height : 25px;
        width : 478px;
        padding : 5px 10px;
        margin : 5px 0;
    }
    @media (max-width: 1150px) {
      margin : 15px 0;
      input{
        width : 60vw;
      }
    }
    input:focus{
        outline : none;
    }
`
function InputB(props) {
  return (
    <Wrapper>
        <label for="name">{props.label}</label><br />
        <input type="text" name="name" onChange={props.onChange}/>
    </Wrapper>
  )
}

export default InputB