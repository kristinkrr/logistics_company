import { Navbar } from './components/Navbar';
import { AuthenticationProvider } from './features/auth/state/AuthenticationProvider';
import { Shipments } from './features/shipments/Shipments';

export const App: React.FunctionComponent = () => {
  return (
    <main>
      <AuthenticationProvider>
        <div className='p-2'>
          <Navbar />

          <Shipments />
        </div>
      </AuthenticationProvider>
    </main>
  );
};
