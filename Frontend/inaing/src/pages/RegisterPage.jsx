import React from 'react'
import styled from 'styled-components'
import NavBar from '../components/navigation/NavBar'
import Padding from '../components/widget/Padding'
import LoginCard from '../components/card/Login/LoginCard'
import FeaturesSection from '../components/sections/FeaturesSection'
import RegisterCard from '../components/card/Login/RegisterCard'

const Wrapper = styled.div`
  color : #0f2c56;
`
const Container = styled.div`
  padding-bottom : 80px;
`
const Title = styled.div`
  font-size : 80px;
  margin : 40px;
  margin-bottom : 0px;
  b{
    font-weight : 600;
  }
`
const SubTitle = styled.div`
    font-size : 22px;
    margin-left : 44px;
    max-width : 680px;
`
const Center = styled.div`
  width : fit-content;
  margin : auto;
`
function RegisterPage() {
  return (
    <Wrapper>
      <NavBar/>
      <Padding/>
      <Container>
          <Title>
            Create <b>account</b>
          </Title>
          <SubTitle>
            Save time on your orders, save multiple delivery addresses and track your deliveries in real time!
          </SubTitle>
          <Center>
            <RegisterCard/>
          </Center>
      </Container>
      <FeaturesSection/>
    </Wrapper>
  )
}

export default RegisterPage