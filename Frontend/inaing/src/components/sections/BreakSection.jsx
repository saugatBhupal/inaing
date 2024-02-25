import React from 'react'
import styled from 'styled-components'
import breakImage from '../../assets/images/break/break-image.png'
import ButtonA from '../button/ButtonA'

const Wrapper = styled.div`
    margin-top : 100px;
    height : 400px;
    background-image: url(${breakImage});
    background-size : cover;
    background-attachment: fixed;
    background-position: center;
    background-repeat: no-repeat;
    display : flex;
    align-items : center;
    justify-content : space-around;
`
const Content = styled.div`
   font-size : 35px;
   color : #ffffffdc;
   button{
    margin-top : 30px;
   }
`
function BreakSection() {
  return (
    <Wrapper>
        <Content>
            New Collection<br/>
            <ButtonA text ={"Discover the lookbook"}/>
        </Content>
    </Wrapper>
  )
}

export default BreakSection