import React from 'react'
import styled from 'styled-components'

const Wrapper = styled.div`
    color: #212737;
    font-size : 14px;
    textarea{
        border : solid 1px #21273720;
        height : 180px;
        width : 478px;
        padding : 5px 10px;
        margin : 5px 0;
        resize : none;
        @media (max-width: 1150px) {
          width : 60vw;
        }
    }
    @media (max-width: 1150px) {
      margin : 30px 0;
    }
    textarea:focus{
        outline : none;
    }
`
function TextArea(props) {
  return (
    <Wrapper>
        <label for="name">{props.label}</label><br />
        <textarea type="text" name="name" onChange={props.onChange}/>
    </Wrapper>
  )
}

export default TextArea