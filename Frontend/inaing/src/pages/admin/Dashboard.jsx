import React from 'react'
import styled from 'styled-components'
import NavBar from '../../components/navigation/NavBar'
import Padding from '../../components/widget/Padding'
import AddProduct from '../../components/widget/AddProduct'
import ListOrders from '../../components/widget/ListOrders'

const Wrapper = styled.div`
    
`
const Title = styled.div`
    font-size : 48px;
    color : #0f2c56;
    text-align : center;
    margin : 20px auto;
`
const Container = styled.div`
    margin : 20px;
    display : flex;
    flex-direction : column;
`
function Dashboard() {
  return (
    <Wrapper>
        <NavBar/>
        <Padding/>
        <Title>
            Admin Options
        </Title>
        <Container>
            <AddProduct/>
            <ListOrders/>
        </Container>
    </Wrapper>
  )
}

export default Dashboard