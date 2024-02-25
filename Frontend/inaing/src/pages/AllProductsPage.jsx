import React from 'react'
import styled from 'styled-components'
import NavBar from '../components/navigation/NavBar'
import ApparelType from '../components/widget/ApparelType'
import Padding from '../components/widget/Padding'
import ItemCard from '../components/card/ItemCard'
import FullCollection from '../components/collections/FullCollection'

const Wrapper = styled.div`
`
const TitleSection = styled.div`
  color : #0f2c56;
  text-align : center;
  height : 150px;
  display : flex;
  align-items : center;
  h1{
    font-size : 65px;
    width : fit-content;
    margin : auto;
  }
`
const Container = styled.div`

  width : 90vw;
  @media (max-width : 900px) {
    width : 100%;
  }
  margin : auto;
`
const ProductsContainer = styled.div`

`
const Top = styled.div`
  display : flex;
  font-size : 15px;
  justify-content : space-between;
  margin : 20px 0; 
  color : #78797b;
  @media (max-width : 900px) {
    margin : 20px 10px;
    margin-bottom : 0px;
  }
`
const Count = styled.div`
  cursor: pointer;
`
const Filter = styled.div`
  position : relative;
  cursor: pointer;
`
const Icon = styled.div`
  display : none;
`
function AllProductsPage({type}) {
  return (
    <Wrapper>
        <NavBar currentPage={type}/>
        <Padding/>
        <Container>
          <TitleSection>
              <h1>{type.toUpperCase()}</h1>
          </TitleSection>
          <ApparelType type={"women"}/>
          <Top>
            <Count>
              379 products
            </Count>
            <Filter>
              <a>Sort by</a>
              <Icon></Icon>
            </Filter>
          </Top>
          <ProductsContainer>
            <FullCollection/>
          </ProductsContainer>
        </Container>
        
    </Wrapper>
  )
}

export default AllProductsPage