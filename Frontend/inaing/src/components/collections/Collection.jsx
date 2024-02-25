import React, { useRef, useState } from 'react'
import styled from 'styled-components'
import ItemCard from '../card/ItemCard'
import ItemCardFirst from '../card/ItemCardFirst'
import arrowLeft from '../../assets/images/icon/arrow-left.svg'
import arrowRight from '../../assets/images/icon/arrow-right.svg'

const Wrapper = styled.div`
  margin : 100px auto;
`
const Container = styled.div`
  display : flex;
  overflow-y : scroll;
  scroll-behavior : smooth;
  &&::-webkit-scrollbar {
    display: none !important;
  }
  div{
    margin : 5px;
  }
`
const Title = styled.div`
  h1{
    font-weight : 100;
    font-size : 60px;
    color : #0f2c56;
  }
  text-align : center;
`
const Next = styled.div`
  position : absolute;
  top  : 18px;
  right : 18px;
  transition-duration : 0.2s;
  color : #0f2c56;
  cursor: pointer;

`

const Prev = styled.div`
  position : absolute;
  top  : 18px;
  right : 74px;
  cursor: pointer;
  transition-duration : 0.2s;

`

const ScrollButtons = styled.div`
  position : relative;
  display : flex;
  justify-content : flex-end;
  margin : 10px;
  button{
    border: 2px solid #0000002f;
    background-color : transparent;
    height : 45px;
    width : 45px;
    border-radius : 50%;
    margin : 5px;
    cursor: pointer;
    z-index : 99;
    transition-duration : 0.2s;
    &:hover{
      border-color : #15325b;
    }
  }
  
`
function Collection() {
  const containerRef = useRef();

  const handleScroll = (scrollAmount) => {
    const newScrollPosition = containerRef.current.scrollLeft + scrollAmount;
    containerRef.current.scrollLeft = newScrollPosition;
  };
  return (
    <Wrapper>
      <Title><h1>Cap Indigo</h1></Title>
      <ScrollButtons>
          <button onClick={()=>{handleScroll(-300)}}></button>
        <Next>
          <img src={arrowRight} alt="" height={"20px"}/>
        </Next>
          <button onClick={()=>{handleScroll(300)}}></button>
        <Prev>
          <img src={arrowLeft} alt="" height={"20px"}/>
        </Prev>
      </ScrollButtons>
      <Container ref={containerRef}>
        <ItemCardFirst/>
        <ItemCard/>
        <ItemCard/>
        <ItemCard/>
        <ItemCard/>
        <ItemCard/>
        <ItemCard/>
        <ItemCard/>
        <ItemCard/>
      </Container>
    </Wrapper>
  )
}

export default Collection