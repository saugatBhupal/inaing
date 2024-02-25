import React from 'react'
import styled from 'styled-components'

const Wrapper = styled.div`
    text-align : center;
    color : white;
    font-size : 14px;
    font-weight : 500;
    padding : 10px 0;
    background-color : #0f2c56;
`
function TopBar() {
  return (
    <Wrapper>FREE Shipping on all रु 15000 + orders</Wrapper>
  )
}

export default TopBar